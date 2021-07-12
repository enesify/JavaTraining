package tr.org.bura.egitim.java.chapter15.runnable;

import java.time.LocalTime;

public class RunnableExample {
    public static void main(String[] args) {
        Thread childThread = new Thread(new CounterRunnable());
        //Thread.currentThread().setPriority(1);
        //childThread.setPriority(Thread.MAX_PRIORITY);
        childThread.start();
        System.out.println("This is called after the child thread has been started.");

    }
}
