package pckg_guess_game;

import java.util.Scanner;

public class AppTest {
    private static Scanner scanner;
    public static void main(String[] args) {

        int val = AUX_CLS.generateAgeToGuess();
        System.out.println(val);
        Scanner scanner = new Scanner(System.in);
        //AUX_CLS.enterAge(scanner);
        AUX_CLS.inputGuessAge(scanner);
        System.out.println("You have entered age guess: " + AUX_CLS.getEnteredAgeValue());

    }
}
