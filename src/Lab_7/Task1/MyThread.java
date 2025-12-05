package Lab_7.Task1;
/* task_1 Создать два потока, которые будут вычислять
сумму элементов массива по половинкам, после чего результаты
 будут складываться в главном потоке.*/
public class MyThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int sum;
    @Override
    public void run(){
        for (int i=start; i<end; i++){
            sum+=array[i];
        }
    }
    public MyThread(int[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public int getSum() {
        return sum;
    }

}
