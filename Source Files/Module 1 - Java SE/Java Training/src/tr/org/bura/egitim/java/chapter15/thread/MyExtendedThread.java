package tr.org.bura.egitim.java.chapter15.thread;

public class MyExtendedThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("This is a thread, and has ID: "
                    + Thread.currentThread().getId()
                    + " and with priority: "
                    + Thread.currentThread().getPriority());
        } catch (Exception e) {
            System.out.println("An error occurred while running thread: " + e.getMessage());
        }
    }
}
