package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(",");
        System.out.println(isAnagram(strings[0].trim(),strings[1].trim()));
    }

    public static boolean isAnagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] cs1 = s1.toCharArray();
        Arrays.sort(cs1);
        char[] cs2 = s2.toCharArray();
        Arrays.sort(cs2);
        if (Arrays.equals(cs1,cs2)){
            return true;
        }
        return false;
    }
}
