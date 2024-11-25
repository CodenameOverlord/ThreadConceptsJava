package JoinThreadWaitForMainThread;

public class JoiningThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i = 0; i< 5; ++i){
                try {
                    Thread.sleep(1000);
                    System.out.println("Running...");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        Thread thread = new Thread(runnable, "DaemonThread");
        thread.setDaemon(true);
        thread.start();

        // waiting for thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main Finished");
    }
}
