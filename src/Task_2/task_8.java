package Task_2;
import java.util.*;
import java.util.regex.*;

public class task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Matcher m = Pattern.compile("-?\\d+").matcher(input);
        List<Integer> nums = new ArrayList<>();
        while (m.find()) nums.add(Integer.parseInt(m.group()));

        if (nums.isEmpty()) { System.out.println(0); return; }

        int total = nums.size();
        int n = (int) Math.sqrt(total);
        if (n * n != total) { System.out.println("Ошибка: матрица не квадратная"); return; }

        int sum = 0;
        for (int i = 0; i < total; i += n + 1) sum += nums.get(i);

        System.out.println(sum);
    }
}
