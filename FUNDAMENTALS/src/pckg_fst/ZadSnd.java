package pckg_fst;

public class ZadSnd {
    public static void main(String[] args) {

        String ups = "Samo neki string";

        switch (ups) {
            case "TO" :
            {
                System.out.println("Fst case...");
                break;
            }
            case "SND":
            {
                System.out.println("Snd case...");
                break;
            }
            default:
                System.out.println("This is smth unexpected"); break;
        }
    }
}
