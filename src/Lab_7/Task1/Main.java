package Lab_7.Task1;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MyThread thread1 = new MyThread(a, 0, a.length / 2);
        MyThread thread2 = new MyThread(a, a.length / 2, a.length);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
            int totalSum = thread1.getSum() + thread2.getSum();
            System.out.println("Total Sum: " + totalSum);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}