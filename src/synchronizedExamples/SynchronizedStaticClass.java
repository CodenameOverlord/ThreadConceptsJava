package synchronizedExamples;

public class SynchronizedStaticClass {
    public static Object object;
    public static synchronized void setObject(Object obj){
        object = obj;
    }
    public static synchronized Object getObject(){
        return object;
    }

    public static void setObj(Object obj){
        synchronized (SynchronizedStaticClass.class){
            object = obj;
        }
    }

    public static Object getObj(){
        synchronized (SynchronizedStaticClass.class){
            return object;
        }
    }
}
