package Lab_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Task_3
public class UpperAfterLower {
    public static void main (String[] args){
        String text = "helloWorld ThisIsA TestString withSome UppercaseLettersAfter LowercaseLetters.";
        Pattern pattern = Pattern.compile("[a-z]{1}+[A-Z]{1}");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(result, "!"+matcher.group(0)+"!");
        }
        matcher.appendTail(result);
        System.out.println(result);
    }
}
