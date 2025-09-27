package Task_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int[] m=daysToWeek(days);
        System.out.println(m[1] + " " + formOfOutput(m[1], "неделя", "недели", "недель") + " и " +
                m[0] + " " + formOfOutput(m[0], "день", "дня", "дней"));
    }
    public static String formOfOutput(int number,String form1,String form2, String form5){
        number = number % 100;
        if (number >= 11 && number <= 14)
            return form5;
        number = number % 10;
        if (number == 1)
            return form1;
        if (number >= 2 && number <= 4)
            return form2;
        return form5;
    }
    public static int[] daysToWeek(int number){
        int weeks = number/7;
        int dayscount = number-(7*weeks);
        int[] result = new int[2];
        result[0] = dayscount;
        result[1] = weeks;
        return result;
    }
}
