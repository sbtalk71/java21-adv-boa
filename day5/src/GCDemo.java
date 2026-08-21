import java.util.*;

public class GCDemo {
    public static void main(String[] args) throws Exception {
        List<byte[]> objects = new ArrayList<>();

        for (int i = 0; i < 20_000; i++) {
            objects.add(new byte[64 * 1024]);

            if (objects.size() > 200) {
                objects.subList(0, 100).clear();
            }

            if (i % 1000 == 0) {
                Thread.sleep(20);
            }
        }

        System.out.println("Finished");
        Thread.sleep(10_000);
    }
}
