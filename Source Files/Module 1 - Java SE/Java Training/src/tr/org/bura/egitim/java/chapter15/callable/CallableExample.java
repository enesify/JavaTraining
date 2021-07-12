package tr.org.bura.egitim.java.chapter15.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);


        Future<Long> result1 = executor.submit(new FactorialCallable(9, 0));
        Future<Long> result2 = executor.submit(new FactorialCallable(10, 2000));
        System.out.println("result1.isDone() : " + result1.isDone());
        System.out.println("result2.isDone() : " + result2.isDone());

        System.out.println(result1.get());
        System.out.println("result1.isDone() : " + result1.isDone());
        System.out.println("result2.isDone() : " + result2.isDone());
        System.out.println(result2.get());
        System.out.println("result1.isDone() : " + result1.isDone());
        System.out.println("result2.isDone() : " + result2.isDone());

        executor.shutdown();

        System.out.println("This is just after the calling the callable factorial calculation.");

    }
}
