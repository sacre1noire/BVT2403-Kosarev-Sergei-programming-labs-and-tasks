package Lab_5;

import java.util.Scanner;
import java.util.regex.Pattern;
//Task_2
public class PasswordCorrect {
    public static void main(String[] args) {
        System.out.println("Введите пароль длинной от 8 до 16 символов, состоящий из латинских букв и цифр, содержащий хотя бы одну заглавную букву и одну цифру:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$");
        if (pattern.matcher(password).matches()) {
            System.out.println("Пароль корректен.");
        } else {
            System.out.println("Пароль некорректен.");
        }
    }
}
