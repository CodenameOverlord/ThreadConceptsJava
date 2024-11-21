package CreateThreadFourWays;

public class SecondWayRunnableThread {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnableThread());
        myThread.start();
    }
    public static class MyRunnableThread implements Runnable{
        @Override
        public void run() {
            System.out.println("MyRunnableThread running");
            System.out.println("MyRunnableThread finished");
        }
    }
}
