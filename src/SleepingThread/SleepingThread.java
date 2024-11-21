package SleepingThread;

public class SleepingThread {
    public static void main(String[] args) {
        Runnable threadR = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
                System.out.println("Thread is sleeping");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread woke up");
            }
        };

        Thread t = new Thread(threadR, "SleepingThread Example");
        t.start();


    }
}
