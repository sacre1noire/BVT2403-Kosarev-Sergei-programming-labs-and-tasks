package Lab_4.exeptions;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static final String LOG_FILE = "log.txt";

    public static void log(Exception e) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write("Исключение: " + e.toString() + "\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
