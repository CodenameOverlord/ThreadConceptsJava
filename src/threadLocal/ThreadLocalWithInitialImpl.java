package threadLocal;

public class ThreadLocalWithInitialImpl {
    static class ExtendingObject{
        int x;
        ExtendingObject(){
            x = 1;
        }
    }
    public static void main(String[] args) {

        ThreadLocal threadLocal1 = ThreadLocal.withInitial(()-> new ExtendingObject());


        Thread t1 = new Thread(()->{
                    System.out.println("from thread t1 " + threadLocal1.get());
                }
        );

        Thread t2 = new Thread(()->{
            System.out.println("from thread t2 "+threadLocal1.get());
        });
        t2.start();
        t1.start();

    }
}
