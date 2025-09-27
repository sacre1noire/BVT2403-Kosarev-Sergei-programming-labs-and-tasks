package Task_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(digitSum(number));
    }
    public static  int digitSum(int number){
       String s = "" + number;
       int sum = 0;
       int len = s.length();
        for (int i=0;i <len; i++){
            char ch = s.charAt(i);
            int symbol = ch - '0';
            sum = sum + symbol;
        } return sum;
    }
}
