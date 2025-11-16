package Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countWords(s));
    }

    public static int countWords(String s){
        String[] splits = s.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splits));
        list.removeIf(s1 -> s1.trim().isEmpty());
        return list.toArray().length;
    }
}
