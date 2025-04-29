import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExpressaoLambda();
        System.out.println("---");
        StreamApiEx();
        System.out.println("---");
        CompletableFutureExample completableFutureExample = new CompletableFutureExample();
        completableFutureExample.run();
        System.out.println("---");
        MultiThreadExample multiThreadExample1 = new MultiThreadExample("Thread 1");
        MultiThreadExample multiThreadExample2 = new MultiThreadExample("Thread 2");
        MultiThreadExample multiThreadExample3 = new MultiThreadExample("Thread 3");

        Thread thread1 = new Thread(multiThreadExample1);
        Thread thread2 = new Thread(multiThreadExample2);
        Thread thread3 = new Thread(multiThreadExample3);

        thread1.start();
        thread2.start();
        thread3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread Valor atual do loop " + i);
        }

        thread1.join();
        thread2.join();
        thread3.join();
    }

    private static void StreamApiEx() {
        List<String> frutas = new ArrayList<>();
        frutas.add("banana");
        frutas.add("maça");
        frutas.add("uva");
        frutas.add("laranja");
        frutas.stream().forEach(System.out::println); // o mesmo que frutas.stream().forEach(item -> System.out.println(item));
    }

    interface FactorialNumber {
        boolean test(int a, int b);
    }

    public static void ExpressaoLambda() {
        FactorialNumber isFactor = (a, b) -> (b % a) == 0;

        if (isFactor.test(9, 5)) {
            System.out.println("is a factor");
        } else {
            System.out.println("is not a factor");
        }
    }
}