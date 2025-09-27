package Task_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        System.out.println(average(a,b,c));
    }
    public static double average(double a, double b, double c){
        double avg=(a+b+c)/3;
        return avg;
    }
}
