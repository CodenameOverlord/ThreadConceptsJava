package JavaMemoryThreadConcept;

public class MyRunnable implements Runnable {
    int count = 0;
    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            System.out.println(count++);
        }
    }
}
