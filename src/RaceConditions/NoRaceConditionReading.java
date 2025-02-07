package RaceConditions;

public class NoRaceConditionReading {
    private static class Counter{
        int count = 0;
        Counter(){
            this.count = 0;
        }
        int incAndGet (){
            synchronized (this){
                count++;
                return  count;
            }

        }
    }
    private static Runnable getRunnable(Counter counter, String message){
        return new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100_000_000; ++i){
                    counter.incAndGet();
                }
                System.out.println(message+counter.count);
            }
        };
    }

    private static Runnable getReadingRunnableThread(Counter counter, String message){
        return new Runnable() {
            @Override
            public void run() {
                while(counter.count<100_000_000){
                    System.out.println("Reading the thread value"+ counter.count);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(getRunnable(counter, "Writing thread") );
        Thread t2 = new Thread(getReadingRunnableThread(counter, "Reading thread value"));
        t1.start();
        t2.start();

    }
}
