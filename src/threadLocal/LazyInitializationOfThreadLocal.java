package threadLocal;

public class LazyInitializationOfThreadLocal {
    public static void main(String[] args) {
        ThreadLocal <String> threadLocal = new ThreadLocal<>();
        threadLocal.set("set by main");
        System.out.println(threadLocal.get());

        Thread t1 = new Thread(()->{
//            threadLocal.set("done by thread1");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            String val = threadLocal.get();
            System.out.println("printing from thread1 "+ val);
            threadLocal.set("set by thread1");
            val = threadLocal.get();
            System.out.println(val);
        });
        System.out.println(threadLocal.get());
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
