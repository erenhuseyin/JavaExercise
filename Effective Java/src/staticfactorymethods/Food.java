package staticfactorymethods;

public class Food {

    String name;

    /*
    public Food(boolean cold){

    }

     */

    public static Food coldFood(String name){
        return new TunaSalad();
    }

    public static Food hotFood(String name){
        return new Kebab();
    }
}
