package RaceConditions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RaceConditionConcurrentHashMap {
    public static void main(String[] args) {
        Map<String, String> sharedMap = new ConcurrentHashMap<>();
        Thread t1 = new Thread(getRunnable(sharedMap));
        Thread t2 = new Thread(getRunnable(sharedMap));

        t1.start();
        t2.start();

    }

    private static Runnable getRunnable (Map<String, String> sharedMap){
        return()->{
            for (int i = 0; i < 100_000_00; i++) {
                if (sharedMap.containsKey("key")){
                    String value = sharedMap.remove("key");
                    if(value == null){
                        System.out.println("Iteration " +i+" : value for key is null");
                    }
                }else{
                    sharedMap.put("key","value");
                }
            }
        };
    }
}
