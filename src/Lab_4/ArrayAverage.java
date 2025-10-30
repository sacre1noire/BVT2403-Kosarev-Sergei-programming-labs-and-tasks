package Lab_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayAverage {
    public static void main(String[] args){
        try {
            int sum=0;
            System.out.println("Введите размер массива");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Введите элементы массива");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println("Верен ли ваш массив? Y/n");
            System.out.println(Arrays.toString(arr));
            String answ = scanner.nextLine();
            if (answ.equals("Y")) {
                for (int i =0;i < arr.length;i++){
                    sum+=arr[i];
             }
                double average = (double) sum/arr.length;
                System.out.println(average);
            }
            if (answ.equals("n")){
                System.out.println("Какой элемент по индексу вы хотите заменить?");
                int index = scanner.nextInt();
                System.out.println("Какое значение должно быть у элемента?");
                int value = scanner.nextInt();
                arr[index] = value;
                for (int i =0;i < arr.length;i++){
                    sum+=arr[i];
                }
                double average = (double) sum/arr.length;
                System.out.println(average);
            }

        } catch (InputMismatchException e) {
            System.out.println("Массив должен содержать только числа");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Массив не может иметь отрицательную длинну");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Указанный индекс выходит за рамки массива");
        }
    }
}