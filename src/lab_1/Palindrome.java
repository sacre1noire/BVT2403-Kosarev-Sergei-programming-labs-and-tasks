package lab_1;

public class Palindrome {
    public static void main(String[] args){
        for (String s : args) {
            System.out.println(s + ": " + isPalindrome(s));
        }
    }
    public static String reverseStrings(String s){
        int len = s.length();
        StringBuilder reversedString=new StringBuilder();
        for (int i=len-1;i>=0;i--){
            reversedString.append(s.charAt(i));
        }
        return reversedString.toString();
    }
    public static boolean isPalindrome(String s){
        if (s.equals(reverseStrings(s))){
            return true;
        }
        return false;
    }
}
