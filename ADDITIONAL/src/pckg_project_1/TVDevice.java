package pckg_project_1;

public class TVDevice extends MediaDevice{
    private String currentChannel;
    private  static final int MAXCH = 999;


    protected TVDevice(String brand, String model) {
        super(brand, model);
        this.currentChannel = "1";
    }

    @Override
    protected void initializeBaseMediaDevice() {
        System.out.println("TVDevice is initialized!");
        System.out.println("Current chanel: " + currentChannel);
    }


    @Override
    public void play() {
        System.out.println("Playing on the chanel: " + currentChannel);

    }

    @Override
    public void pause() {
        System.out.println("Pause the program - automatically run the recorder...");

    }

    @Override
    public void stop() {
        System.out.println("Turning off the TV Device!");

    }

    @Override
    public void next() {
        if (Integer.parseInt(currentChannel) == 999){
            this.currentChannel = "1";
            System.out.println("Going to first channel");
        }else {
            this.currentChannel = String.valueOf(Integer.parseInt(currentChannel)+1);
            System.out.println("The next channel is: " + currentChannel);
        }

    }

    @Override
    public void previous() {
        if (Integer.parseInt(currentChannel) == 1){
            this.currentChannel = String.valueOf(MAXCH);
            System.out.println("Previous channel is: " + MAXCH);
        }else {
            this.currentChannel = String.valueOf(Integer.parseInt(currentChannel)-1);
            System.out.println("Previous channel now is: " + currentChannel );
        }

    }

    @Override
    public String toString() {
        return "TVDevice{" +
                "currentChannel='" + currentChannel + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
