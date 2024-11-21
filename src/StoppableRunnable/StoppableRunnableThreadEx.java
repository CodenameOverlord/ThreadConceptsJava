package StoppableRunnable;

public class StoppableRunnableThreadEx {
    static class StoppableRunnableThread implements Runnable {

        private boolean stopRequested = false;

        public synchronized void setStopRequested(){
            this.stopRequested = true;
        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }
        private void sleep(long millis){
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            System.out.println("Thread " +Thread.currentThread().getName()+ "is running");
            while(!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable stop");
        }
    }
    public static void main(String[] args) {
        StoppableRunnableThread stoppableRunnableThread = new StoppableRunnableThread();
        Thread thread = new Thread(stoppableRunnableThread, "new Thread name");
        System.out.println("Requesting Stop");
        stoppableRunnableThread.setStopRequested();
        System.out.println("Stop requested");
    }
}
