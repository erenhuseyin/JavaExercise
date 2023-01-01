package defence;

public abstract class Weapon extends Defence{
    private int damage;
    private String name;

    public Weapon(int id, int price, int damage, String name) {
        super(id, price);
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
