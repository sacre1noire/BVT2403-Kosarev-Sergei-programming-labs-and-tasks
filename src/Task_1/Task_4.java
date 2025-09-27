package Task_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int digits = scanner.nextInt();
        System.out.println(isEven(digits));
    }
    public static boolean isEven(int number){
        if (number%2==0){
            return true;
        }
        return false;
    }
}
