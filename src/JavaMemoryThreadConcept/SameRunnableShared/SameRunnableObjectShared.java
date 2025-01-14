package JavaMemoryThreadConcept.SameRunnableShared;

import JavaMemoryThreadConcept.MyRunnable;

public class SameRunnableObjectShared {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable, "threadt1");
        Thread t2 = new Thread(runnable, "threadt2");
        t1.start();
        t2.start();
    }
}

