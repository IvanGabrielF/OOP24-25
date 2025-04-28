package pckg_fst;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class TestApp {
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        scanner = new Scanner(System.in);

        System.out.println("Please enter one integer number: ");
        int number = scanner.nextInt();
        System.out.println("You have entered: " + number);
        readTxtFile("src/fst/robot.txt");


    }
    private static void readTxtFile(String filePath) throws FileNotFoundException {
        scanner = new Scanner(new File((filePath)));
        String line;

        while (scanner.hasNextLine()){
            line = scanner.nextLine();

        }


    }
    private static void readTxtFile2(String filePath){
       // Path path = Path.get(filePath);

    }
}
