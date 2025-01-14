package JavaMemoryThreadConcept.ObjectsInsideRunnable.ObjectOutsideRunTakenFromCallingClass;

import JavaMemoryThreadConcept.ObjectsInsideRunnable.MyClass;

public class MyRunnableObjectOutsideRunTakenFromParent implements Runnable {
    MyClass myClass;
    MyRunnableObjectOutsideRunTakenFromParent (MyClass myClass){
        this.myClass = myClass;
    }
    @Override
    public void run() {
        System.out.println(myClass);
    } 
}
