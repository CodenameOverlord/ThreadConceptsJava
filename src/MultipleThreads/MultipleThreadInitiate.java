package MultipleThreads;

public class MultipleThreadInitiate {
    public static void main(String[] args) {
        Runnable threadR  = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running" + Thread.currentThread().getName());
                System.out.println("Stopped" + Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(threadR, "first Thread starting");
        t1.start();
        Thread t2 = new Thread(threadR, "second Thread starting");
        t2.start();


    }
}
