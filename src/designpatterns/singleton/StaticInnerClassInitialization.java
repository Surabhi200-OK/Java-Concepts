package designpatterns.singleton;

public class StaticInnerClassInitialization {

    private StaticInnerClassInitialization(){}

    private static class SingletonInner{
        private static final StaticInnerClassInitialization INSTANCE = new StaticInnerClassInitialization();
    }

    public static StaticInnerClassInitialization getInstance(){
       return SingletonInner.INSTANCE;
    }
}
