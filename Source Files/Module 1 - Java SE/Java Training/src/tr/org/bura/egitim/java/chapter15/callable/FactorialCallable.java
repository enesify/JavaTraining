package tr.org.bura.egitim.java.chapter15.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FactorialCallable implements Callable<Long> {
    private final Integer factorialNumber;
    private final long sleepTime;

    public FactorialCallable(Integer factorialNumber, long sleepTime) {
        this.factorialNumber = factorialNumber;
        this.sleepTime = sleepTime;
    }

    @Override
    public Long call() throws InterruptedException {
        return calculateFactorial();
    }

    private long calculateFactorial() throws InterruptedException {
        int result = 1;
        for (int i = 2; i <= factorialNumber ; i++) {
            result *= i;
        }
        if (this.sleepTime != 0){
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        }
        return result;
    }
}
