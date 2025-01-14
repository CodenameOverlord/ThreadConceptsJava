package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectsOutsideRunMethod;

public class DifferentRunnable {
    public static void main(String[] args) {
        Runnable runnable1 = new MyRunnableObjectOutsideRun();
        Runnable runnable2 = new MyRunnableObjectOutsideRun();

        Thread t1 = new Thread(runnable1,"threadT1");
        Thread t2 = new Thread(runnable2, "threadt2");
        t1.start();t2.start();
    }
}
