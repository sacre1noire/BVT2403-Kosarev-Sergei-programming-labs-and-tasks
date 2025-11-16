package Task_3;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(sumOfDigits(input));
    }

    public static int sumOfDigits(int a){
        int count=0;
        String x = String.valueOf(a);
        for (int i =0; i<x.length();i++){
            int tts = Integer.parseInt(String.valueOf(x.charAt(i)));
            count += tts;
        }
    return count;
    }
}
