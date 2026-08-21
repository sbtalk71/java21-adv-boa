package threads.structured.concurrency;
import java.util.concurrent.StructuredTaskScope;

public class StructuredFailureDemo {

    static String userService()
            throws InterruptedException {

        Thread.sleep(1000);
        return "User data";
    }

    static String orderService()
            throws Exception {

        Thread.sleep(500);

        throw new RuntimeException(
                "Order service unavailable");
    }

    public static void main(String[] args) {

        try (var scope =
                     new StructuredTaskScope.ShutdownOnFailure()) {

            var user =
                    scope.fork(
                            StructuredFailureDemo::userService);

            var orders =
                    scope.fork(
                            StructuredFailureDemo::orderService);

            scope.join();

            scope.throwIfFailed();

            System.out.println(user.get());
            System.out.println(orders.get());

        } catch (Exception e) {

            System.out.println(
                    "Request failed: " + e.getMessage());
        }
    }
}