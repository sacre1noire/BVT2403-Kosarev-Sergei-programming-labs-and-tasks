package Lab_5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
//Task_1
public class NumberFinder {
    public static void main(String[] args){
        String text = "The price is 100 dollars and  the  discount is 20 percent. Price after discount is 80.50 dollars. Negative numbers like -5 and -3.14 are also included.";
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+|-?\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
