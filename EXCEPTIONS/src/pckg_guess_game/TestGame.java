package pckg_guess_game;

import java.util.Scanner;

public class TestGame {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Player player = new Player(new Person("Roko"), "PL-23434");


        //AgeGuessGame.startGame(player);
        playNewGame(player);
        player.seeGameResults();



    }
    public static void playNewGame(Player player){
        boolean play = true;
        while (play){
            AgeGuessGame.startGame(player);
            System.out.println("New game for this player - y for yes, any other for  no!");
            play = "y".equalsIgnoreCase(scanner.nextLine());

        }
        System.out.println("Out of this game block");
    }
}
