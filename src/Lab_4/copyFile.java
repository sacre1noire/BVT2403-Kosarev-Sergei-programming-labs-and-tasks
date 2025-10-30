package Lab_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class copyFile {
    public static void main(String[] args) {
        String sourceFile = "docs/file_to_fis.txt";
        String destFile   = "docs/file_to_fos.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            System.out.println("Файл успешно скопирован");

        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }
}
