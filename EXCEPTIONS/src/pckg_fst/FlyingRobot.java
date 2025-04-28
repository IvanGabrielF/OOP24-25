package pckg_fst;

public class FlyingRobot extends Robot{
    private int flyingHours;
    public FlyingRobot(String name) {
        super(name);
        this.flyingHours = 3;
    }

    @Override
    public void performTask() {
        if (flyingHours >= 0){
            System.out.println("Flying robot " + name );
        }else {
            System.out.println();
            flyingHours--;
        }

    }

    @Override
    public void chargeRobot() {
        System.out.println("This one is using fuelRobot method!");
        fuelRobot();
    }

    public void fuelRobot(){
        System.out.println("Flying robot " + name + " is refuling...");
    }
}
