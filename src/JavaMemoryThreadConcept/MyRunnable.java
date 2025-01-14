package JavaMemoryThreadConcept;

public class MyRunnable implements Runnable {
    int count = 0;
    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 100_000; i++) {
                count++;
            }
        }

        System.out.println(Thread.currentThread().getName()+ " ->  " + count);
    }
}
