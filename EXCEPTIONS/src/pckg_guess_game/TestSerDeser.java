package pckg_guess_game;

import java.util.ArrayList;

public class TestSerDeser {
    public static void main(String[] args) {

//        Player player = new Player(new Person("Marija"), "Mare340");
//        System.out.println(Integer.toHexString(player.hashCode()));
          String filePath = "player.bin";
//        AUX_CLS.savePlayerToFile(player,filePath);
//          Player fromFilePlayer = AUX_CLS.readPlayerFromFile(filePath);
//          System.out.println(fromFilePlayer);
//
//          AUX_CLS.readPlayerObjectsFromFile(filePath);
        ArrayList<Player> players = AUX_CLS.readPlayerObjectsFromFile(filePath);
        System.out.println(players);
//        System.out.println(Integer.toHexString(fromFilePlayer.hashCode()));
//        System.out.println(fromFilePlayer);
//        System.out.println("------------------------------------------");
//        Player playerNew = new Player(new Person("Valery"), "Val349");
//        AUX_CLS.savePlayerToFile(playerNew, filePath);
//        Player fromFileNew = AUX_CLS.readPlayerFromFile(filePath);
//        System.out.println(fromFileNew);




    }
}
