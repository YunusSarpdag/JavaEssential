package MultiThreading;

import javax.xml.transform.Result;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("start main thread");
        runAsync();
        System.out.println("----------------");
        supplyAsync();
        System.out.println("----------------");
        thenApply();
        System.out.println("----------------");
        thenAccept();
        System.out.println("end main thread");
    }

    static void runAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() ->{
            try {
                Thread.sleep(1000);
                System.out.println("in runAsync step 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("in runAsync step 2");
        completableFuture.get();
        System.out.println("in runAsync step 3");
    }

    static void supplyAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->{
            try {
                Thread.sleep(1000);
                System.out.println("in supplyAsync step 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result";
        });
        System.out.println("in supplyAsync step 2");
        String result = completableFuture.get();
        System.out.println("result is : " + result);
        System.out.println("in supplyAsync step 3");
    }

    static void thenApply() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->{
            try {
                Thread.sleep(1000);
                System.out.println("in supplyAsync step 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Step 1";
        });
        System.out.println("in middle supplyAsync step 2");
        CompletableFuture<String> finalC = completableFuture.thenApply((test) ->{
            try {
                Thread.sleep(1000);
                System.out.println("in thenApply step 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return test + " Step 2";
        });
        System.out.println("in supplyAsync step 4");
        String finalResult = finalC.get();
        System.out.println("final result is : " + finalResult);
        System.out.println("in supplyAsync step 5");
    }

    static void thenAccept() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() ->{
            try {
                Thread.sleep(1000);
                System.out.println("in thenAccept step 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Step 1";
        }).thenAccept(result ->{
            System.out.println(result + " Step 2");
        });
        System.out.println("in thenAccept step 2");
        completableFuture.get();
        System.out.println("in thenAccept step 3");
    }
}
