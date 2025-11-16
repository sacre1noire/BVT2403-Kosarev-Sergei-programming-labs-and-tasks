package Task_3;

import java.util.Scanner;

public class task_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(fibonnaci(a));
    }

    public static int fibonnaci(int a){
        if (a==0) return 0;
        if (a==1) return 1;
        return fibonnaci(a-1)+fibonnaci(a-2);
    }
}
