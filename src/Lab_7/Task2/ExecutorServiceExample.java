package Lab_7. Task2;
import java. util.ArrayList;
import java.util. List;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static int Execute1(int[][] matrix) {
        int globalMax = Integer.MIN_VALUE;

        ExecutorService executor = Executors.newFixedThreadPool(matrix.length);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            final int row = i;
            futures.add(executor.submit(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int val : matrix[row]) {
                    if (val > localMax) {
                        localMax = val;
                    }
                }
                return localMax;
            }));
        }

        executor.shutdown();

        for (Future<Integer> future : futures) {
            try {
                int localMax = future.get();
                if (localMax > globalMax) {
                    globalMax = localMax;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return globalMax;
    }
}
