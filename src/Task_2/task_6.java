package Task_2;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        String[] splitline = s.split(",");
        int[] numbers = new int[splitline.length];
        for (int i=0;i <splitline.length;i++){
            numbers[i]=Integer.parseInt(splitline[i].trim());
        }
        System.out.println(clamp(numbers));
    }
    public static int clamp(int[] a){
        int value = a[0];
        int min = a[1];
        int max = a[2];
        if (value<=min){
            return min;
        }
        if (value >=max){
            return max;
        }
        else {
            return value;
        }
    }
}
