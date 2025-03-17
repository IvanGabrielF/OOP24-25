package pckg_abs_cls;

public class MobilePhone extends Device implements InternetFuncionality{

    public MobilePhone(String brand, String model){
        this.brand = brand;
        this.modelName = model;
    }
    @Override
    protected void recordingPictures() {
        System.out.println("Mobile Phone can record pictures...");
    }

    @Override
    protected void recordingVideos() {
        System.out.println("Mobile Phone can record videos...");

    }


    @Override
    public void saveToCloud() {
        System.out.println("Saving to cloud - " + getClass().getSimpleName());
    }

    @Override
    public void surfTheNet() {
        System.out.println("Finding something on net");

    }

    @Override
    public void performChatGPTResearch() {
        System.out.println("Diving in chatgpt");

    }

}
