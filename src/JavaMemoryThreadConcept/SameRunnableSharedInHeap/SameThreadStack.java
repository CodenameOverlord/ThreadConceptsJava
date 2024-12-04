package JavaMemoryThreadConcept.SameRunnableSharedInHeap;

import JavaMemoryThreadConcept.MyRunnable;

public class SameThreadStack {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "t1");
        Thread t2 = new Thread(myRunnable, "t2");

        t1.start();
        t2.start();

    }
}
