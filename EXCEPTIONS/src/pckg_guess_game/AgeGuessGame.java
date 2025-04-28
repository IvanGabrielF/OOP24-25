package pckg_guess_game;

import java.util.ArrayList;
import java.util.Scanner;

public class AgeGuessGame {

    private static Scanner scanner;
    private static  ArrayList<Integer> guesses;

    public static void startGame(Player player){
        guesses = new ArrayList<>();
        boolean continuePlay = true;
        scanner = new Scanner(System.in);
        int ageToGuess = AUX_CLS.generateAgeToGuess();
        while (continuePlay){
            AUX_CLS.inputGuessAge(scanner);
            logPlayerGuess(AUX_CLS.getEnteredAgeValue());
            if (AUX_CLS.isGuess(ageToGuess)){
                System.out.println("You have guessed the random age value: " + ageToGuess);
                continuePlay = false;
            }else {
                System.out.println("Sorry - you have missed secret age value!");
                AUX_CLS.helperGuessAttempt(ageToGuess);
                continuePlay = continueToPlay();

            }

        }
        System.out.println("Out of game or game over!");
        provideGameStat();
        player.addGameResults(guesses);



    }
    public static boolean continueToPlay(){
        System.out.println("To continue press 'y' and other for no!");
        String input = scanner.nextLine();
        return "y".equalsIgnoreCase(input);
    }

    public static void logPlayerGuess(int playerGuessAge){
        guesses.add(playerGuessAge);
    }
    public static void provideGameStat(){
        System.out.println("------------- Player game stat ----------------");
        System.out.println("Total attempts: " + guesses.size());
        System.out.println("All attempts: " + guesses);

    }
}
