package pckg_polymorphism;

public class Device {

    protected String name;

    public Device(String name){
        System.out.println("This is from device: " + this.getClass().getSimpleName());
        System.out.println(this);

    }

    public void turnON(){
        System.out.println("Turning on device...");
    }
}
