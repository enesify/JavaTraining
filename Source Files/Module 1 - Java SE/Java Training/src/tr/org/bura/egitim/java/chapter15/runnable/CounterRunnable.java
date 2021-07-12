package tr.org.bura.egitim.java.chapter15.runnable;

import java.time.LocalTime;
import java.util.Date;

public class CounterRunnable implements Runnable{
    @Override
    public void run() {
        long sum = 0;
        for (long i = 0; i < 2000; i++) {
            sum+= i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("(Calculated in child thread) Sum of numbers between 0 and 2000 is: " + sum);
    }
}
