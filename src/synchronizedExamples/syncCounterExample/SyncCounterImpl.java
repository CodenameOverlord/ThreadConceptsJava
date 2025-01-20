package synchronizedExamples.syncCounterExample;

import synchronizedExamples.syncCounterExample.usingSync.SyncCounter;

public class SyncCounterImpl {
    public static void main(String[] args) {
        SyncCounter syncCounter = new SyncCounter();
        Thread t1  = new Thread(()->{
            for (int i = 0; i< 100_000; ++i){
                syncCounter.incCounter();
            }
            System.out.println(syncCounter.getCounter());
        });

        Thread t2  = new Thread(()->{
            for (int i = 0; i< 100_000; ++i){
                syncCounter.incCounter();
            }
            System.out.println(syncCounter.getCounter());
        });
        t1.start();
        t2.start();

    }
}
