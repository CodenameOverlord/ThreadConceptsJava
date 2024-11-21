public class ThirdWayRunnableAnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread implementation started");
                System.out.println("Anonymous Thread implementation finished");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
