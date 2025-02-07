package RaceConditions;

public class ExampleRaceCondition {
    private static class Counter{
        int count = 0;
        Counter(){
            this.count = 0;
        }
        int incAndGet (){
            count++;
            return  count;
        }
    }
    private static Runnable getRunnable(Counter counter, String message){
        return new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100_000; ++i){
                    counter.incAndGet();
                }
                System.out.println(message+counter.count);
            }
        };
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(getRunnable(counter, "Thread1 final count:" ));
        Thread t2 = new Thread(getRunnable(counter, "Thread2 final count"));
        t1.start(); t2.start();
    }

}
