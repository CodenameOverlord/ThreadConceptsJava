package JavaVirtualThread;

public class JavaVirtualThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Statement from Runnable, thread Name -> "
                        + Thread.currentThread().getName());
            }
        };

        //create and start the virtual thread
        Thread startedThread = Thread.ofVirtual().start(runnable);

        //create but do not start the virtual thread
        Thread unStartedThread  = Thread.ofVirtual().unstarted(runnable);

        unStartedThread.start();

        // joining a virtual thread is similar as joining a normal thread
        try {
            unStartedThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
