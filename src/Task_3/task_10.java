package Task_3;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] splits = s.split(",");
        int[] digits = new int[splits.length];
        for (int i =0; i<splits.length;i++){
            digits[i] = Integer.parseInt(splits[i].trim());
        }
        System.out.println(isTriangle(digits));
    }

    public static boolean isTriangle(int[] list){
        int a = list[0];
        int b = list[1];
        int c = list[2];
        if (a+b<=c) return false;
        if (a+c<=b) return false;
        if (b+c<=a) return false;
    return true;
    }
}
