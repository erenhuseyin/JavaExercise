package staticfactorymethods;

public class Workspace {

    //Food food = new Food(boolean fish);
    //Yukarıdaki gibi static olmayan methodu new'lediğimiz zaman metod adı olmadığı için neden bu şekilde kullandığımızı bilemeyebiliriz.

    private String launch;
    Food food = Food.hotFood(launch);

    //newleyerek üretildiğinde memory'de yeni bir alan açılır, statik değerin yeri ayırtıldığı için doğru kullanımında bellekten tasarruf edilmesini sağlar.

    /*
    public class Doner{
        public Doner(boolean soganli){
            //...
        }
    }

    // Buradaki parametre (true) ne anlama geliyor? Açıp dokümantasyonu okumak lazım.
    Doner doner = new Doner(true);

    public class Doner{
        public static Doner soganliDoner(){
            //...
        }

        public static Doner sogansizDoner(){
            //...
        }
    }

    // Bu kodu okumak çok daha kolay!
    Doner doner = Doner.soganliDoner();
    Doner doner = Doner.sogansizDoner();

     */
}
