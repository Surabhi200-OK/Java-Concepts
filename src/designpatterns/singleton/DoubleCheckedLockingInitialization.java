package designpatterns.singleton;

public class DoubleCheckedLockingInitialization {
    private static volatile DoubleCheckedLockingInitialization obj = null;

    private DoubleCheckedLockingInitialization(){}

    public static DoubleCheckedLockingInitialization getInstance(){
        if(obj == null){
            synchronized (DoubleCheckedLockingInitialization.class){
                if(obj == null){
                    obj = new DoubleCheckedLockingInitialization();
                }
            }
        }
        return obj;
    }
}
