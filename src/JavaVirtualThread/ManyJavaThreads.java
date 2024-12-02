package JavaVirtualThread;

import java.util.LinkedList;
import java.util.List;

public class ManyJavaThreads {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i< 10; ++i){
                    System.out.println("Hello -> "+ i + " times.");
                }

            }
        };
        int n = 1000;
        List<Thread> all_Threads = new LinkedList<>();
        for(int i = 0; i< n; ++i){
            Thread v_thread = Thread.ofVirtual().unstarted(runnable);
            all_Threads.add(v_thread);
            System.out.println("startoing"+ i +"th thread");
            v_thread.start();
        }


        for(int i = 0; i< all_Threads.size(); ++i){
            try {
                all_Threads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
