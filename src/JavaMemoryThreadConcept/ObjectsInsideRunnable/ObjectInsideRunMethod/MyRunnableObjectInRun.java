package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectInsideRunMethod;

import JavaMemoryThreadConcept.ObjectsInsideRunnable.MyClass;

public class MyRunnableObjectInRun implements Runnable {
    int count = 0;
    @Override
    public void run() {
        MyClass myClass = new MyClass();
        System.out.println(myClass);
//        for (int i = 0; i < 100_000; i++) {
//            System.out.print(count++);
//        }
    } 
}
