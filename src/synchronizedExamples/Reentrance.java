package synchronizedExamples;

public class Reentrance {
    private int counter= 0;

    public synchronized void  incCounter (){
        //thread accessing incAndGetCounter will also be allowed to enter counter since the
//        monitorObject is same
        counter++;
    }

    public synchronized int incAndGetCounter(){
        incCounter();
        return this.counter;
    }
}
