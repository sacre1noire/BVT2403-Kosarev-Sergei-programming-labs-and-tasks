package Task_2;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String[] splitnumbers = s.split(",");
        int[] numbers = new int[splitnumbers.length];
        for (int i=0;i < splitnumbers.length;i++){
            numbers[i] = Integer.parseInt(splitnumbers[i].trim());
        }
        System.out.println(sumOfPositives(numbers));
    }

    public static int sumOfPositives(int[] a){
        int count =0;
        for (int i=0;i<a.length;i++){
            if (a[i]>=0){
                count +=a[i];
            }
        }
    return count;
    }
}
