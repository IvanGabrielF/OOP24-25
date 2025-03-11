package pckg_fst;

public class AppMain {

    public static void main(String[] args) {
        String name = "SuperMan";
        String surname ="Domaći";
        int value = 100;
        int val2 = 200;
        String result;

        int res;

        result = name + " " + surname;
        System.out.println(result);

        res = value + val2;
        System.out.println("Result is: "+ res);
        System.out.println("Some name: "+ name);

        if(res > 100) {
            System.out.println("Veći rezultat od 100");
        }else{
            System.out.println("Manji ili jdenak od 100");
        }



    }
}
