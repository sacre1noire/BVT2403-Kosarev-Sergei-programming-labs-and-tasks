package Task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int celsium = console.nextInt();
        console.nextLine();
        System.out.println(toFarenheit(celsium));
        console.close();
    }

    public static int toFarenheit(int celsium) {
        int farenheit = (int)(celsium * 9.0 / 5 + 32);
        return farenheit;
    }
}
