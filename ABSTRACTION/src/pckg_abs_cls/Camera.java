package pckg_abs_cls;

public class Camera extends Device{

    private final String focus;

    public Camera(String brand, String model){
        this.focus = "Automatic";
        this.modelName = model;
        this.brand = brand;
    }


    public Camera(String brand, String modelName, String focus){
        this.brand = brand;
        this.modelName = modelName;
        this.focus = focus;

    }


    @Override
    protected void recordingPictures() {
        System.out.println("Recording pictures with camera...");

    }

    @Override
    protected void recordingVideos() {
        System.out.println("Recording videos with camera...");

    }


}
