package Task_2;
import java.util.*;
public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();              // "[1, 2, 3, 4, 5], 1"
        int open = line.indexOf('['), close = line.indexOf(']');
        String inside = (open >= 0 && close > open) ? line.substring(open + 1, close) : "";
        String after = (close >= 0 && close + 1 < line.length()) ? line.substring(close + 1) : "";

        int[] a;
        inside = inside.trim();
        if (inside.isEmpty()) a = new int[0];
        else {
            String[] parts = inside.split(",");
            a = new int[parts.length];
            for (int i = 0; i < parts.length; i++) a[i] = Integer.parseInt(parts[i].trim());
        }

        // получаем k (берём первое целое число в оставшейся части строки)
        after = after.replaceAll("[^\\-0-9]+", " ").trim();
        int k = after.isEmpty() ? 0 : Integer.parseInt(after.split("\\s+")[0]);

        System.out.println(Arrays.toString(rotateRight(a, k)));
    }

    static int[] rotateRight(int[] a, int k) {
        int n = a.length;
        if (n == 0) return a;
        k = ((k % n) + n) % n;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) r[(i + k) % n] = a[i];
        return r;
    }
}
