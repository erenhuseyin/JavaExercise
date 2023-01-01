package location;

import defence.Bow;
import defence.MageWand;
import defence.Sword;
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
        Weapon[] weapons = {new Bow(), new Sword(), new MageWand()};
        for(Weapon w : weapons){
            System.out.println(
                    w.getId() + ". " + w.getName() +
                    "\n\tDamage: " + w.getDamage() +
                    "\n\tPrice: " + w.getPrice());
        }
        System.out.println("0. Exit");
        return weapons;
    }


    private void buyArmor() {
    }

    private void buyWeapon() {
        System.out.println("Which one do you prefer to buy");

        Weapon[] weapons = printWeapon();
        while (true) {
            int select = scanner.nextInt();

            if (select == 1) {
                if (weapons[0].getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye. Fakir!");
                    continue;
                } else {
                    getPlayer().setDamage(getPlayer().getDamage() + weapons[0].getDamage());
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[0].getPrice());
                    getPlayer().getInventory().setWeaponDamage(weapons[0].getDamage());
                    getPlayer().getInventory().setWeaponName(weapons[0].getName());

                    System.out.println(getPlayer().getName() + " " + weapons[0].getName()
                            + " silahını satın aldın.\nGüncel özelliklerin: ");

                    System.out.println("\n\t \033[0;31mHasar: " + getPlayer().getDamage() + "\u001B[0m"
                            + "\n\t Sağlık: " + getPlayer().getHealth() + "\n\t \033[0;31mBakiye: "
                            + getPlayer().getMoney() + "\u001B[0m");

                    break;
                }

            } else if (select == 2) {
                if (weapons[1].getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye. Fakir!");
                    continue;
                } else {
                    getPlayer().setDamage(getPlayer().getDamage() + weapons[1].getDamage());
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[1].getPrice());
                    getPlayer().getInventory().setWeaponDamage(weapons[1].getDamage());
                    getPlayer().getInventory().setWeaponName(weapons[1].getName());

                    System.out.println(getPlayer().getName() + " " + weapons[1].getName()
                            + " silahını satın aldın.\nGüncel özelliklerin: ");

                    System.out.println("\n\t \033[0;31mHasar: " + getPlayer().getDamage() + "\u001B[0m"
                            + "\n\t Sağlık: " + getPlayer().getHealth() + "\n\t \033[0;31mBakiye: "
                            + getPlayer().getMoney() + "\u001B[0m");

                    break;
                }

            } else if (select == 3) {
                if (weapons[2].getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz bakiye. Fakir!");
                    continue;
                } else {
                    getPlayer().setDamage(getPlayer().getDamage() + weapons[2].getDamage());
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[2].getPrice());
                    getPlayer().getInventory().setWeaponDamage(weapons[2].getDamage());
                    getPlayer().getInventory().setWeaponName(weapons[2].getName());

                    System.out.println(getPlayer().getName() + " " + weapons[2].getName()
                            + " silahını satın aldın.\nGüncel özelliklerin: ");

                    System.out.println("\n\t \033[0;31mHasar: " + getPlayer().getDamage() + "\u001B[0m"
                            + "\n\t Sağlık: " + getPlayer().getHealth() + "\n\t \033[0;31mBakiye: "
                            + getPlayer().getMoney() + "\u001B[0m");

                    break;
                }
            }
            if (select == 0) {
                System.out.println("Çıkış yapıldı");
                break;
            } else {
                System.out.print("Bir seçim yapmadın. Lütfen bir seçim yap: ");
            }

            if (select == 1 || select == 2 || select == 3) {
                break;
            }

        }
    }
}
