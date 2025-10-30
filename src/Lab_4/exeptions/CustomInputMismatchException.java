package Lab_4.exeptions;

public class CustomInputMismatchException extends Exception {
    private String inputValue;
    public CustomInputMismatchException(String inputValue) {
        super("Ошибка: вы ввели не число");
        this.inputValue = inputValue;
    }

    public String getInputValue() {
        return inputValue;
    }
}
