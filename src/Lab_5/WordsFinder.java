package Lab_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Task_5
public class WordsFinder {
    public static void main(String[] args){
       String text = "Apple apricot banana Avocado berry Cherry date.";
       System.out.println(findWordsStartingWith(text, 'a'));
    }
    public static String findWordsStartingWith(String text, char letter){
        Pattern pattern = Pattern.compile("\\b" + letter + "\\w*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()){
            result.append(matcher.group()).append(" ");
        }
        return result.toString().trim();
    }
}
