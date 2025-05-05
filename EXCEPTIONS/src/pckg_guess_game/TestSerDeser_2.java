package pckg_guess_game;

import java.util.ArrayList;

public class TestSerDeser_2 {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();
       // Player[] playersArray = {new Player(new Person("Miki")), "Mii342"), new Person("Hoo");
        populatePlayers(players, 5);
        listAllPlayers(players);
        String pathToPlayers = "players_arr_list.bin";
        AUX_CLS.savePlayersListToFile(players, pathToPlayers);
        ArrayList<Player> playersNew = AUX_CLS.readPlayersFromFile(pathToPlayers);
        listAllPlayers(playersNew);
        //AUX_CLS.savePlayersArrInFile(playersArray,

    }

    //proucit zasto je void ne arraylist
    public static void populatePlayers(ArrayList<Player> players, int numPlayers){
        for (int k=0; k<numPlayers; k++){
            Player player = new Player(new Person("Player-"+k), "GamePlayerName_"+k);
            players.add(player);

        }
        System.out.println("All players added to list!");
    }

    private static void listAllPlayers(ArrayList<Player> players){
        System.out.println("\n----------------------------------------------");
        System.out.println(Integer.toHexString(players.hashCode()));
        for (Player player : players){
            System.out.println(player);
        }
    }

}
