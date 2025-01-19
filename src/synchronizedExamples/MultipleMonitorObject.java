package synchronizedExamples;

public class MultipleMonitorObject {
    public Object monitor1 = new Object();
    public Object monitor2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    public void incCounter1(){
        synchronized (this.monitor1){
            counter1++;
        }
    }

    public void incCounter2(){
        synchronized (this.monitor2){
            counter2++;
        }
    }
}
