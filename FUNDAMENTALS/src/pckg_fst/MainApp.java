package pckg_fst;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("This is some message");
        if(args.length > 0){
            for(int k = 0; k < args.length; k++){
                System.out.println("Arg is  : " + args);
            }
        }else{
            System.out.println("No arguments given and none passed to main");
        }
    }
}


