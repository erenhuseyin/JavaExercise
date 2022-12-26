package game;

import location.Location;
import player.Player;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    public void start(){
        System.out.println("Welcome to the Ancfor");
        System.out.print("Enter your name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome to the Elsweyr, "+player.getName()+ "... It's hard to survive in here!");
        player.selectCharacter();

        Location location = null;
        while (true){
            System.out.println(
                    "\n\t1. SafeHouse\n\t2. ToolStore\n\t3. Maðara\n\t4. Orman\n\t5. Nehir\n\t6. Maden\n\t7. Exit");
        }
        int selectLocation = input.nextInt();

    }

}
