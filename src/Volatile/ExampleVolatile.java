package Volatile;

public class ExampleVolatile {
    private Object object;
    private volatile boolean hasNewObject = false;

    public void setObject(Object object){
        this.object = object;
        this.hasNewObject = true;
    }

    public Object getObject(){
        while(!this.hasNewObject){

        }
        Object returnValue = this.object;
        this.hasNewObject = false;
        return returnValue;
    }
}
