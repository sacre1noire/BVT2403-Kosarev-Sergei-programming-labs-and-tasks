package Task_3;

import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countVowels(s));
    }

    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        String vowels = "aeiou";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
