package synchronizedExamples.SharedMonitorObject;

public class SharedMonitorObject {
    SharedMonitorObject(Object monitorObject){
        this.monitorObject = monitorObject;
    }
    Object monitorObject = null;
    public int counter = 0;
    public void incCounter(){
        synchronized (this.monitorObject){
            counter++;
        }
    }
}
