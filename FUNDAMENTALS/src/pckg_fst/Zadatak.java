package pckg_fst;

import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj bodova na ispitu: ");
        int bodovi = scanner.nextInt();

        while (bodovi > 100 || bodovi < 0){
            System.out.println("Unesen krivi broj bodova!");
            System.out.println("------------------------");
            System.out.print("Unesite broj bodova na ispitu: ");
            bodovi = scanner.nextInt();

        }
        if (bodovi == 1000){
            System.out.println("");
        } else if (bodovi >= 90) {
            System.out.println(bodovi + " su veći od 90 i ocjena je 5!");

        } else if (bodovi >= 77) {
            System.out.println(bodovi + " su veći od 77 i ocjena je 4!");

        } else if (bodovi >= 62) {
            System.out.println(bodovi + " su veći od 62 i ocjena je 3!");

        } else if (bodovi >= 50) {
            System.out.println(bodovi + " su veći od 50 i ocjena je 2!");

        }else {
            System.out.println(bodovi + " su manji od 50 i ocjena je 1!");
        }

    }

}
