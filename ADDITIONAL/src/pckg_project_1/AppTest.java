package pckg_project_1;

public class AppTest {
    public static void main(String[] args) {

        MediaCenter mediaCenter = new MediaCenter(new TVDevice("Sony", "Smart 4K"));
        mediaCenter.setMediaDevice(new MusicPlayer("Apple", "Apple box 5"));
        mediaCenter.initMediaDevice();
        mediaCenter.playOnMediaDevice();
        mediaCenter.goToNext();
        mediaCenter.goToNext();
        mediaCenter.goToPrevious();
        mediaCenter.pauseMediaDeviePlaying();
        mediaCenter.stopMediaDevice();
        System.out.println(mediaCenter);

    }
    
}
