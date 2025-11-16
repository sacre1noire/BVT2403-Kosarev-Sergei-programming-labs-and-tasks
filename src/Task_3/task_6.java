package Task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        String subs = s.substring(1,s.length()-1);
        String[] splits = subs.split(",");
        int[] digits = new int[splits.length];
        for (int i=0; i<splits.length;i++){
            digits[i]= Integer.parseInt(splits[i].trim());
        }
        System.out.println(filterEven(digits));
    }

    public static ArrayList<Integer> filterEven(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                list.add(a[i]);
            }
        }
    return list;
    }

}
