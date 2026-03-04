package designpatterns.singleton;

public class LazyInitialization {

    private static LazyInitialization obj;

    private LazyInitialization(){
        System.out.println("Created the object");
    }

    public static LazyInitialization getInstance(){
        if(obj == null){
            obj = new LazyInitialization();
        }
        return obj;
    }

    public static void main(String[] args) {
        LazyInitialization.getInstance();
    }
}
