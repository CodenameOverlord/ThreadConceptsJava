package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectsOutsideRunMethod;

public class SameRunnableInDifferentThread {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnableObjectOutsideRun();
        Thread t1 = new Thread(myRunnable, "t1");
        Thread t2 = new Thread(myRunnable, "t2");

        t1.start();
        t2.start();
    }
}
