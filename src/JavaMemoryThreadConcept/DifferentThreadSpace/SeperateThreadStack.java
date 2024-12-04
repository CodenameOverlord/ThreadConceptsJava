package JavaMemoryThreadConcept.DifferentThreadSpace;

import JavaMemoryThreadConcept.MyRunnable;

public class SeperateThreadStack {
    public static void main(String[] args) {
        Runnable myRunnable1 = new MyRunnable();
        Runnable myRunnable2 = new MyRunnable();

        Thread t1 = new Thread (myRunnable1, "t1");
        Thread t2 = new Thread (myRunnable2, "t2");
        t1.start();
        t2.start();
    }

}
