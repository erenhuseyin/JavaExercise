package singletonpattern;

public class SingletonWorkspace {

    public static void main(String[] args) {
        DefineSingleton defineSingleton = DefineSingleton.defineSingleton;
        DefineSingleton defineSingleton1 = DefineSingleton.getInstance();

        System.out.println(defineSingleton.hashCode());
        System.out.println(defineSingleton1.hashCode());
    }
}