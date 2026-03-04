package designpatterns.singleton;

public class ThreadSafeInitialization {

    private static ThreadSafeInitialization obj;

    private ThreadSafeInitialization(){
        System.out.println("Created the object");
    }

    public static synchronized ThreadSafeInitialization getInstance(){
        if(obj == null){
            obj = new ThreadSafeInitialization();
        }
        return obj;
    }
}
