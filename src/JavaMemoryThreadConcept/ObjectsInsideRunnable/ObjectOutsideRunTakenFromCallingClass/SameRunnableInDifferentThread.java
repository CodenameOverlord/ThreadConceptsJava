package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectOutsideRunTakenFromCallingClass;

import JavaMemoryThreadConcept.ObjectsInsideRunnable.MyClass;

public class SameRunnableInDifferentThread {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Runnable myRunnable = new MyRunnableObjectOutsideRunTakenFromParent(myClass);
        Thread t1 = new Thread(myRunnable, "t1");
        Thread t2 = new Thread(myRunnable, "t2");

        t1.start();
        t2.start();
    }
}
