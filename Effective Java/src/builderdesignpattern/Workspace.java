package builderdesignpattern;

public class Workspace {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore.Builder("tall")
                .milkChoose(true)
                .lactoseFreeChoose(true)
                .priceCounting(45).build();

    }
}
