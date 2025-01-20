package synchronizedExamples.syncCounterExample;

import synchronizedExamples.syncCounterExample.withoutSync.SimpleCounter;

public class WithoutSyncExample {
    public static void main(String[] args) {
        SimpleCounter simpleCounter = new SimpleCounter();
        Thread t1 = new Thread(()->{
                    for (int i =0; i< 100_000; ++i){
                        simpleCounter.incCounter();
                    }
                    System.out.println(simpleCounter.getCounter());
                }
        );
        Thread t2 = new Thread(()->{
                    for (int i =0; i< 100_000; ++i){
                        simpleCounter.incCounter();
                    }
                    System.out.println(simpleCounter.getCounter());
                }
        );

        t1.start();
        t2.start();
    }
}
