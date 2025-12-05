package Lab_7.Task3;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class RecursiveTransfer extends RecursiveAction {
    private Warehouse warehouse;
    private int start;
    private int end;

    private static final Object lock = new Object();
    private static int weight1 = 0;
    private static int weight2 = 0;
    private static int weight3 = 0;
    private static int tripCount = 1;

    public RecursiveTransfer(int start, int end, Warehouse warehouse){
        this.end=end;
        this.start=start;
        this.warehouse=warehouse;
    }

    public static void reset() {
        weight1 = 0; weight2 = 0; weight3 = 0; tripCount = 1;
    }

    @Override
    protected void compute() {
        if (end - start <= 2) {
            List<Product> subList = warehouse.getProducts(start, end);

            for (Product product : subList) {
                synchronized (lock) {
                    // 1. Если перевес — идем разгружаться
                    if (weight1 + weight2 + weight3 + product.weight > 150) {
                        System.out.println("\n--- Грузчики ушли разгружаться (Рейс " + tripCount + ") ---");
                        weight1 = 0;
                        weight2 = 0;
                        weight3 = 0;
                        tripCount++;
                        System.out.println("--- Грузчики вернулись ---\n");
                    }

                    // 2. Распределяем товар
                    int minWeight = Math.min(weight1, Math.min(weight2, weight3));

                    if (minWeight == weight1) {
                        weight1 += product.weight;
                        System.out.println("Грузчик Артем берет: " + product.getName()+ ", вес " + product.weight);
                    } else if (minWeight == weight2) {
                        weight2 += product.weight;
                        System.out.println("Грузчик Петрович берет: " + product.getName()+ ", вес " + product.weight);
                    } else {
                        weight3 += product.weight;
                        System.out.println("Грузчик Михалыч берет: " + product.getName()+ ", вес " + product.weight);
                    }

                    // 3. Удаляем
                    warehouse.removeProduct(product);
                }
            }
        } else {
            int mid = (start + end) / 2;
            RecursiveTransfer leftTask = new RecursiveTransfer(start, mid, warehouse);
            RecursiveTransfer rightTask = new RecursiveTransfer(mid, end, warehouse);
            invokeAll(leftTask, rightTask);
        }
    }
}