package location;

import defence.Weapon;
import player.Player;

public class Toolsmith extends NormalLocation{

    public Toolsmith(Player player) {
        super(player, "Toolsmith");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Its a nice day right? What can i for you?" +
                "\n\n\t1. Buy gun\n\t2. Buy armor\n\t3. Exit");
        while (true){
            int select = scanner.nextInt();

            if (select == 1) {
                buyWeapon();
            } else if (select == 2) {
                buyArmor();
            } else if (select == 3) {
                System.out.println("Left the toolsmith");
                break;
            } else {
                System.out.print("Wrong choice, please make a choice: ");
            }

            if (select == 1 || select == 2 || select == 3) {
                break;
            }

        }

        return true;
    }

    private Weapon[] printWeapon(){
        Weapon[] weapons = {new }
    }

    private void buyArmor() {
    }

    private void buyWeapon() {
        System.out.println("Which one do you prefer to buy");

        Weapon[] weapons = printWeapon();
    }
}
