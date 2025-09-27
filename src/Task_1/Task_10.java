package Task_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        System.out.println(season(numberOfMonth));
    }
    public static String season(int number){
        switch (number){
            case 12:
            case 1:
            case 2:
                return "зима";
            case 3:
            case 4:
            case 5:
                return "весна";
            case 6:
            case 7:
            case 8:
                return "лето";
            case 9:
            case 10:
            case 11:
                return "осень";
            default:
                return "Некорректный номер месяца";
        }
    }

}
