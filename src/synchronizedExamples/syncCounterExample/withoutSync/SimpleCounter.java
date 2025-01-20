package synchronizedExamples.syncCounterExample.withoutSync;

public class SimpleCounter {
    long counter = 0;
    public  void incCounter(){
        counter++;
    }
    public long getCounter(){
        return this.counter;
    }
}


