package DaemonThread;

import static java.lang.Thread.sleep;

public class DaemonThreadEx {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Running thread " + Thread.currentThread().getName());
                }
            }
        };
        Thread thread = new Thread(runnable, "DaemonThread example.");
        thread.setDaemon(true);
        thread.start();
        sleep(1000);
        System.out.println("MainThread stopped.");
    }

    private static void sleep(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
