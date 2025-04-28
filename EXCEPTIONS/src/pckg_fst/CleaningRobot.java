package pckg_fst;

public class CleaningRobot extends Robot{
    private int cleaningHours;
    public CleaningRobot(String name) {
        super(name);
        this.cleaningHours = 5;
    }

    @Override
    public void performTask() {
        System.out.println("Cleaning robot " + name + " has no cleaing left...");
        System.out.println("Cleaning robot " + name + " is cleaning some space...");

    }
    public void chargeRobot(){
        System.out.println();
    }
}
