package threadLocal;

public class ThreadLocalRemovingVal {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread t1 = new Thread(()->{
            threadLocal.set("done by thread1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String val = threadLocal.get();
            System.out.println(val);
            threadLocal.remove();
            val = threadLocal.get();
            System.out.println(val);
        });
        Thread t2 = new Thread(
                ()->{
                    threadLocal.set("done by thread2");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    String val = threadLocal.get();
                    System.out.println(val);
                }
        );
        t1.start();
        t2.start();

    }
}
