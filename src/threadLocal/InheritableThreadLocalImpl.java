package threadLocal;
import java.lang.InheritableThreadLocal;
public class InheritableThreadLocalImpl {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal();

        Thread t1 = new Thread(
                ()->{
                    System.out.println("INSIDE THREAD 1");
                    threadLocal.set("thread1");
                    inheritableThreadLocal.set("Thread 1 inherited");
                    System.out.println("1 threadLocal val "+ threadLocal.get());
                    System.out.println("1 inheritableThreadLocal val "+ inheritableThreadLocal.get());
                    Thread t11 = new Thread(
                            ()->{
                                System.out.println("INSIDE THREAD 11");
                                System.out.println("11 threadLocal val "+ threadLocal.get());
                                System.out.println("11 inheritableThreadLocal val "+ inheritableThreadLocal.get());
                                System.out.println("THREAD 11 EXECUTION FINISHED");
                            }
                    );
                    t11.start();
                    System.out.println("THREAD 1 EXECUTION FINISHED");

                }
        );
        Thread t2 = new Thread(
        ()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("INSIDE THREAD 2");
            System.out.println("2 threadLocal val "+ threadLocal.get());
            System.out.println("2 inheritableThreadLocal val "+ inheritableThreadLocal.get());
            System.out.println("THREAD 2 EXECUTION FINISHED");
        });
        t1.start();
        t2.start();
    }
}
