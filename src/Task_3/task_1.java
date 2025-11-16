package Task_3;

import java.util.*;

public class task_1 {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        List <String> list = new ArrayList<>(Arrays.asList(split));
        Collections.reverse(list);
        String result = String.join(" ", list);
        System.out.println(result);
     }
}
