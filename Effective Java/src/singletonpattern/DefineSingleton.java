package singletonpattern;

public class DefineSingleton {

    public static DefineSingleton defineSingleton = new DefineSingleton();

    private DefineSingleton(){

    }

    public static DefineSingleton getInstance(){
        return defineSingleton;
    }
}
