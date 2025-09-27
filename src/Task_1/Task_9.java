package Task_1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(isPrime(a));
    }
    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
