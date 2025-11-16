package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String input = s.substring(1,s.length() -1);
        String[] splits = input.split(",");
        int[] digits = new int[splits.length];
        for (int i =0; i< splits.length;i++){
            digits[i]= Integer.parseInt(splits[i].trim());
        }
        System.out.println(secondLargest(digits));
    }
    public static int secondLargest(int[] a){
        Arrays.sort(a);
        int second = a[a.length-2];
        return second;
    }
}
