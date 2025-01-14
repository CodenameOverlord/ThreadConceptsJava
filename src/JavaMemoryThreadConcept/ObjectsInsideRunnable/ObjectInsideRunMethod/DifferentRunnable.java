package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectInsideRunMethod;

import JavaMemoryThreadConcept.MyRunnable;
import JavaMemoryThreadConcept.ObjectsInsideRunnable.MyClass;
import JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectOutsideRunTakenFromCallingClass.MyRunnableObjectOutsideRunTakenFromParent;

public class DifferentRunnable {
    public static void main(String[] args) {
        Runnable runnable1 = new MyRunnableObjectInRun();
        Runnable runnable2 = new MyRunnableObjectInRun();

        Thread t1 = new Thread(runnable1,"threadT1");
        Thread t2 = new Thread(runnable2, "threadt2");
        t1.start();t2.start();
    }
}
