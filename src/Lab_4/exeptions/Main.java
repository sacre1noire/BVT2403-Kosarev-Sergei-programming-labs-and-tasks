package Lab_4.exeptions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        String userInput = scanner.nextLine();

        try {
            if (!userInput.matches("-?\\d+")) {
                throw new CustomInputMismatchException(userInput);
            }

            int number = Integer.parseInt(userInput);
            System.out.println("Вы ввели число: " + number);

        } catch (CustomInputMismatchException e) {
            System.out.println(e.getMessage() + ", введено: " + e.getInputValue());
            Logger.log(e);
        }
    }
}
