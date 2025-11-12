package Task_2;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        String[] stringNumbers = s.split(",");
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i].trim());
        }
        System.out.println(sumRange(numbers[0],numbers[1]));
    }

    public static int sumRange(int a, int b){
        int count =0;
        for (int i =a;i<=b;i++){
            count+=i;
        }
    return count;
    }
}
