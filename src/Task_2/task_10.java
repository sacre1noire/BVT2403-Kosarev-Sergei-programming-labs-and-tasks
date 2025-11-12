package Task_2;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(grade(score));
    }

    public static String grade(int a){
        if (a<0 || a>100){
            return "Число вне диапазона";
        }
        if (a>=90 && a<=100){
            return "A";
        }
        if (a>=80 && a<=89){
            return "B";
        }
        if (a>=70 && a<=79){
            return "C";
        }
        if (a>=60 && a<=69){
            return "D";
        }
        if (a>=0 && a<=59){
            return "F";
        }
    return"";
    }
}
