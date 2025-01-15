package synchronizedExamples;

public class HybridSynchronization {
    public static Object classLevelObj;

    public static synchronized void  setClassLevelObj(Object obj){
        classLevelObj = obj;
    }
    public static Object  getClassLevelObj(){
        synchronized (HybridSynchronization.class){
            return classLevelObj;
        }
    }


    public Object instanceLevelObj;
    public synchronized void setInstanceLevelObj(Object obj){
        instanceLevelObj = obj;
    }
    public Object getInstanceLevelObj(){
        synchronized (this){
            return classLevelObj;
        }
    }


}
