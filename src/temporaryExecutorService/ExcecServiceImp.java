package temporaryExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecServiceImp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService1 = Executors.newCachedThreadPool()
                ;


        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        executorService1.submit(t1);
    }
}
