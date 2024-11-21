package CreateThreadFourWays;

public class FourthWayUsingLambdaExpressionRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("thread runnable start");
            System.out.println("thread runnable end");
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
