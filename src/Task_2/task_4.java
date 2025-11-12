package Task_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] splits = s.split(",");
        int[] numbers = new int[splits.length];
        for (int i =0;i < splits.length;i++){
            numbers[i] = Integer.parseInt(splits[i].trim());
        }
        System.out.println(hasDuplicates(numbers));
    }

    public static boolean hasDuplicates(int[] a){
        Set<Integer> seen = new HashSet<>();
        for (int num:a){
            if (!seen.add(num)){
                return true;
            }
        }
    return false;
    }

}
