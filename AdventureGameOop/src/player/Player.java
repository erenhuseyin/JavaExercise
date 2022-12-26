package player;

import character.Hunter;
import character.Unit;
import character.Warrior;
import character.Wizard;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String characterName;
    private Inventory inventory;

    private Scanner inputId = new Scanner(System.in);

    public Player(String name) {
        super();
        this.name = name;
    }

    public void selectCharacter(){
        Unit characterList [] = {
                new Hunter(), new Warrior(), new Wizard()
        };
        System.out.println("---------------------------------------");

        for (Unit c : characterList) {
            System.out.println(c.getId()+". : "+c.getName() +
                    "\t" + " Damage: " + c.getDamage() +
                    "\t" + " Health: " + c.getHealth() +
                    "\t" + " Money: " + c.getMoney() + "\n");
        }

        System.out.println("---------------------------------------");
        System.out.println("Choose your character...");
        int selectChar = inputId.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Hunter());
                break;
            case 2:
                initPlayer(new Warrior());
                break;
            case 3:
                initPlayer(new Wizard());
                break;
            default:
                System.out.println("number not found...");
        }
        System.out.println(this.getName() + ", you choose " + this.getCharacterName()
                + "\n\tYour damage: " + this.getDamage() + "\n\tYour health: " + this.getHealth()
                + "\n\tYour money: " + this.getMoney() + "\n");
    }

    private void initPlayer(Unit unit){
        this.setCharacterName(unit.getName());
        this.setDamage(unit.getDamage());
        this.setHealth(unit.getHealth());
        this.setMoney(unit.getMoney());

    }





    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    void selectChar(){

    }
}
