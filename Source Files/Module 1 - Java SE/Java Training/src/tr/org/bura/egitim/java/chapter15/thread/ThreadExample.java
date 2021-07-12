package tr.org.bura.egitim.java.chapter15.thread;

public class ThreadExample {
    public static void main(String[] args) {
        //---------------extending thread example - 1 -------------------------------
       /* Thread myTestThread1 = new MyExtendedThread();
        Thread myTestThread2 = new MyExtendedThread();
        myTestThread1.start();
        myTestThread2.start();
        System.out.println(myTestThread1.isAlive());
        System.out.println(myTestThread2.isAlive());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());       */


        //---------------extending thread example - 2 -------------------------------

        for (int i = 0; i < 11; i++) {
            Thread extendedThread = new MyExtendedThread();
            extendedThread.start();
            System.out.println("Thread Id: " + extendedThread.getId());
        }
    }
}
