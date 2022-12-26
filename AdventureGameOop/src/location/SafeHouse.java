package location;

import player.Player;

public class SafeHouse extends NormalLocation{


    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in safe house!");
        System.out.println("Your health is regeneration...");
        return true;
    }
}
