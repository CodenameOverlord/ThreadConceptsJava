package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectOutsideRunTakenFromCallingClass;

import JavaMemoryThreadConcept.ObjectsInsideRunnable.MyClass;

public class DifferentRunnable {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Runnable runnable1 = new MyRunnableObjectOutsideRunTakenFromParent(myClass);
        Runnable runnable2 = new MyRunnableObjectOutsideRunTakenFromParent(myClass);

        Thread t1 = new Thread(runnable1,"threadT1");
        Thread t2 = new Thread(runnable2, "threadt2");
        t1.start();t2.start();
    }
}
