package pckg_project_1;

public class MediaCenter {

    private MediaDevice mediaDevice;

    public MediaCenter(MediaDevice mediaDevice){
        this.mediaDevice = mediaDevice;
    }

    public void setMediaDevice(MediaDevice md){
        this.mediaDevice = md;

    }
    public void initMediaDevice(){
        this.mediaDevice.initializeBaseMediaDevice();

    }
    public void playOnMediaDevice(){
        this.mediaDevice.play();
    }
    public void stopMediaDevice(){
        this.mediaDevice.stop();
    }

    public void pauseMediaDeviePlaying(){
        System.out.println("Careful with this one!");
        this.mediaDevice.pause();
    }

    public void goToNext(){
        this.mediaDevice.next();
    }
    public void goToPrevious(){
        this.mediaDevice.previous();
    }


    @Override
    public String toString() {
        return "MediaCenter{" +
                "mediaDevice=" + mediaDevice +
                '}';
    }
}
