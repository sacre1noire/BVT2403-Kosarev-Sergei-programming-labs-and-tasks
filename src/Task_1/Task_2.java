package Task_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(rectangleArea(a,b));
    }
    public static double rectangleArea(double a, double b){
        double square = a*b;
        return square;
    }

}
