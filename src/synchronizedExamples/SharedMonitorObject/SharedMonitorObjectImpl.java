package synchronizedExamples.SharedMonitorObject;

public class SharedMonitorObjectImpl {
    public static void main(String[] args) {
        Object o1 = new Object();

        SharedMonitorObject sharedMonitorObject1 = new SharedMonitorObject(o1);
        SharedMonitorObject sharedMonitorObject2 = new SharedMonitorObject(o1);
        sharedMonitorObject2.incCounter();
        sharedMonitorObject1.incCounter();

        Object o2 = new Object();
        SharedMonitorObject sharedMonitorObject3 = new SharedMonitorObject(o2);
        sharedMonitorObject3.incCounter();
    }



}
