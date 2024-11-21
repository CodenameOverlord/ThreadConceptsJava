public class FirstWayThreadExtendsThread {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
        System.out.println("xxxx");
    }

    public static class MyThread extends Thread
    {
        public  void run(){
            System.out.println("My thread  running");
            System.out.println("My thread  finished");
        }

    }
}
