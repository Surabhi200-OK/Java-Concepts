package designpatterns.singleton;

public enum EnumSingletonInitialization {
    INSTANCE;

    public void doSomething(){
        System.out.println("Doing Something");
    }
}
