package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectsOutsideRunMethod;

import JavaMemoryThreadConcept.ObjectsInsideRunnable.MyClass;

public class MyRunnableObjectOutsideRun implements Runnable {
    MyClass myClass = new MyClass();
    @Override
    public void run() {
        System.out.println(myClass);
//        for (int i = 0; i < 100_000; i++) {
//            System.out.print(count++);
//        }
    } 
}
