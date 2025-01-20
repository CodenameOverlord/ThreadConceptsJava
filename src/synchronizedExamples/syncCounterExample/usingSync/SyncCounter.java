package synchronizedExamples.syncCounterExample.usingSync;

public class SyncCounter {
    long counter = 0;
    public synchronized void incCounter(){
        counter++;
    }
    public synchronized long getCounter(){
        return this.counter;
    }
}
