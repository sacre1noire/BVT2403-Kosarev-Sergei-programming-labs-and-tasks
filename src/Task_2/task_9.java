package Task_2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Integer> result = new ArrayList<>(mergeUniqueSorted(s));
        System.out.println(result.toString().replaceAll(", ", ","));

    }


    public static List<Integer> mergeUniqueSorted(String s){
        Matcher m = Pattern.compile("-?\\d+").matcher(s);
        List<Integer> nums = new ArrayList<>();
        while (m.find()) nums.add(Integer.parseInt(m.group()));
        Set<Integer> uniqueNumbers = new HashSet<>(nums);
        List<Integer> Sortedlist = new ArrayList<>(uniqueNumbers);
        Collections.sort(Sortedlist);
        return Sortedlist;
    }
}
