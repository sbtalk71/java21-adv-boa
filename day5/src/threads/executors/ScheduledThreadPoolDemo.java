package threads.executors;
import java.time.LocalTime;
import java.util.concurrent.*;

public class ScheduledThreadPoolDemo {

    public static void main(String[] args) throws Exception {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(2);

        // Execute once after 3 seconds
        scheduler.schedule(() -> {
            System.out.println(
                "One-time task: " + LocalTime.now()
                + " | " + Thread.currentThread()
            );
        }, 3, TimeUnit.SECONDS);

        // Execute every 2 seconds
        ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(() -> {
            System.out.println(
                "Periodic task: " + LocalTime.now()
                + " | " + Thread.currentThread()
            );
        }, 1, 2, TimeUnit.SECONDS);

        // Let the periodic task run for 8 seconds
        Thread.sleep(8000);

        future.cancel(false);
        scheduler.shutdown();
    }
}