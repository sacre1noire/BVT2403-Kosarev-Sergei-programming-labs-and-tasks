package Lab_8;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class DataManager {
    File file;
    List<Object> processors = Collections.synchronizedList(new ArrayList < > ());
    List<String> sourceData = Collections.synchronizedList(new ArrayList < > ());
    List<String> processedData = Collections.synchronizedList(new ArrayList < > ());
    ExecutorService executor = Executors.newFixedThreadPool(3);

    public DataManager(File file) {
        this.file = file;
    }

    public synchronized void  registerDataProcessor(Object processor){
        processors.add(processor);
    }

    public synchronized List<String> loadData(String source){
        try {
            Path path = Paths.get(source);
            sourceData = Files.lines(path).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    return sourceData;
    }

    public void processData() {
        List<Future<List<String>>> futures = new ArrayList<>();

        // Для каждого зарегистрированного процессора создаём задачу
        for (Object processor : processors) {
            Future<List<String>> future = executor.submit(() -> {
                List<String> localResults = new ArrayList<>();

                // Получаем все методы объекта
                Method[] methods = processor.getClass().getDeclaredMethods();

                for (Method method : methods) {
                    // Проверяем, есть ли аннотация
                    if (method.isAnnotationPresent(DataProcessor.class)) {
                        method.setAccessible(true); // на случай private методов

                        // Предположим, метод принимает List<String> и возвращает List<String>
                        @SuppressWarnings("unchecked")
                        List<String> result = (List<String>) method.invoke(processor, sourceData);

                        if (result != null) {
                            localResults.addAll(result); // собираем результат
                        }
                    }
                }
                return localResults;
            });
            futures.add(future);
        }
        // Собираем результаты всех задач
        processedData.clear(); // на всякий случай
        for (Future<List<String>> f : futures) {
            try {
                processedData.addAll(f.get()); // ждём завершения и добавляем результат
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveData(String destination){
        Path path = Paths.get(destination);
        try {
            Files.write(path, processedData, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void shutdown(){
        executor.shutdown();
    }
}
