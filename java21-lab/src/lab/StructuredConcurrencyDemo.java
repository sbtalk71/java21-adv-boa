package lab;
import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyDemo {

    public record UserProfile(String name, int age) {}
    public record UserOrders(int totalOrders) {}
    public record UserDashboard(UserProfile profile, UserOrders orders) {}

    public UserDashboard fetchDashboardData(String userId) throws Exception {
        
        // 1. Define the task scope using a try-with-resources block
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            
            // 2. Fork the subtasks (they run concurrently on Virtual Threads)
            StructuredTaskScope.Subtask<UserProfile> profileTask = 
                    scope.fork(() -> fetchProfile(userId));
            
            StructuredTaskScope.Subtask<UserOrders> ordersTask = 
                    scope.fork(() -> fetchOrders(userId));

            // 3. Wait for all subtasks to complete (or for one to fail)
            scope.join(); 
            
            // 4. Propagate the exception if any subtask failed
            scope.throwIfFailed(); 

            // 5. Safely extract results using .get() without blocking
            return new UserDashboard(profileTask.get(), ordersTask.get());
        } 
        // 6. When the block closes, all spun up threads are guaranteed to be dead.
    }

    private UserProfile fetchProfile(String userId) throws InterruptedException {
        Thread.sleep(200); // Simulate API call
        return new UserProfile("Alice", 30);
    }

    private UserOrders fetchOrders(String userId) throws InterruptedException {
        Thread.sleep(100); // Simulate database call
        return new UserOrders(5);
    }
    public static void main(String[] args) throws Exception{
		
    	StructuredConcurrencyDemo sc=new StructuredConcurrencyDemo();
    	sc.fetchDashboardData("123");
	}
}
