package program_41;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTasks {
     public static void main(String[] args) throws Exception {
        // 1. Create ExecutorService with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Create a list of Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            tasks.add(() -> {
                return "Task " + taskId + " executed by " + Thread.currentThread().getName();
            });
        }

        // 3. Submit tasks and store Future results
        List<Future<String>> futures = new ArrayList<>();
        for (Callable<String> task : tasks) {
            futures.add(executor.submit(task));
        }

        // 4. Get and print results
        for (Future<String> future : futures) {
            System.out.println(future.get());  // waits for result
        }

        // 5. Shutdown the executor
        executor.shutdown();
    }
}
