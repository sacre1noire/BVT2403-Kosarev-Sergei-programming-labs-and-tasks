package Task_1;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
         String s =scanner.nextLine();
         System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = s.length() - 1; i>=0; i--) {
            reversedString.append(s.charAt(i));

        }
        String reversed = reversedString.toString();
        if (s.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }
}
