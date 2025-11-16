package Task_3;

import java.util.*;

public class task_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        String subs = s.substring(1,s.length()-1);
        String[] splits = subs.split(",");
        int[] digits = new int[splits.length];
        for (int i=0;i<splits.length;i++){
            digits[i] = Integer.parseInt(splits[i].trim());
        }
        System.out.println(differenceMaxMin(digits));
    }

    public static int differenceMaxMin(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<a.length;i++){
            list.add(a[i]);
        }
        Collections.sort(list);
        int diff = list.get(list.size()-1)- list.get(0);
    return diff;
    }
}
