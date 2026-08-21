package threads.executors;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class WorkStealingDemo {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newWorkStealingPool(4);

        IntStream.rangeClosed(1, 22)
                .forEach(taskId -> {

                    executor.submit(() -> {

                        System.out.println(
                            "Task " + taskId +
                            " started by " +
                            Thread.currentThread()
                        );

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        System.out.println(
                            "Task " + taskId +
                            " completed by " +
                            Thread.currentThread()
                        );
                    });
                });

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}