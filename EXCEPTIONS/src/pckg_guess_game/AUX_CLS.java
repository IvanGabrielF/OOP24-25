package pckg_guess_game;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    public static final int MAXI = 150;
    public static final int MINI = 1;
    private static int ageEntered;

    public static int generateAgeToGuess() {
        return ThreadLocalRandom.current().nextInt(MINI, MAXI + 1);


    }

    public static void inputGuessAge(Scanner scanner) {
        boolean valid = false;
        System.out.println("Please enter your age guess - between MIN: " + MINI + " and MAXI: " + MAXI);
        try {
            int guessValue = scanner.nextInt();
            System.out.println("You have entered an integer: " + guessValue);
            if (wrongAgeInputRange(guessValue)) {
                System.out.println("Be carefull with the range of input guess age value!");
            } else {
                valid = true;
                ageEntered = guessValue;
            }
        } catch (InputMismatchException ime) {
            System.out.println("You need to enter an integer.");
            scanner.next();

        } finally {
            if (valid) {
                System.out.println("Everything is ok with the user input!");
                scanner.nextLine();
            } else {
                System.out.println("Another round for player to guess age input!");
                inputGuessAge(scanner);
            }
        }

    }

    public static void enterAge(Scanner scanner) {
        boolean valid = false;
        while (!valid) {
            System.out.println("Please enter your age guess - between MIN: " + MINI + " and MAXI: " + MAXI);
            try {
                int guessValue = scanner.nextInt();
                System.out.println("You have entered an integer: " + guessValue);
                if (wrongAgeInputRange(guessValue)) {
                    System.out.println("Wrong age range - less than: " + MINI + " or greater than " + MAXI);
                } else {
                    valid = true;
                    ageEntered = guessValue;
                }

            } catch (InputMismatchException ime) {
                System.out.println("You need to enter an integer.");
                scanner.next();

            }
        }
    }

    public static boolean wrongAgeInputRange(int guessInput) {
        return (guessInput < MINI || guessInput > MAXI);
    }

    public static int getEnteredAgeValue() {
        return ageEntered;
    }

    public static boolean isGuess(int valueToGuess) {
        return ageEntered == valueToGuess;

    }

    public static void helperGuessAttempt(int ageToGuess) {
        System.out.println("\n----------------------------------- HELPER ----------------------------------");
        if (ageToGuess > ageEntered) {
            System.out.println("You have entered value LOWER from age to guess!");
        }
        if (ageToGuess < ageEntered) {
            System.out.println("You have entered value HIGHER from age to guess!");
        }
    }

    public static void savePlayersListToFile(List<Player> playerList, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            oos.writeObject(playerList);
            System.out.println("All players from input list saved into file!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Player> readPlayersFromFile(String filePath) {
        ArrayList<Player> players = new ArrayList<>();


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            players = (ArrayList<Player>) ois.readObject();
            System.out.println("Success reading file: " + filePath);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return players;
    }



    public static void savePlayerToFile(Player player, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            oos.writeObject(player);
            System.out.println("Player saved to a file!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static ArrayList<Player> readPlayerObjectsFromFile(String filePath){
        ArrayList<Player> players = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(new File(filePath))){
            while (fis.available() > 0){
                ObjectInputStream ois = new ObjectInputStream(fis);
                Player player = (Player) ois.readObject();
                players.add(player);
                System.out.println("New player from file added to list!");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return players;
    }

    public static Player readPlayerFromFile(String filePath) {
        Player player = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
            System.out.println("In try with resources block!");
            int available = ois.available();
            System.out.println("Bytes available: " + available);


        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//
//        }
        return player;

    }


}
