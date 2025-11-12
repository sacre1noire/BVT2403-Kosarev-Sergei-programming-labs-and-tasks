package Task_2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class task_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int digits = abs(scanner.nextInt());
        int[] result = countEvenOddDigits(digits);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] countEvenOddDigits(int digits){
        int chet =0;
        int nechen =0;
        String s= String.format("%d",digits);
        for (int i=0;i<s.length();i++){
            int d = s.charAt(i)-'0';
            if (d %2==0){
                chet+=1;
            } else {
                nechen+=1;
            }
        }
        int[] m = {chet, nechen};
    return m;
    }
}
