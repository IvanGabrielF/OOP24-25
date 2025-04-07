package pckg_project_1;

import java.util.Arrays;

public class MusicPlayer extends MediaDevice{

    private int currentSong;
    private PlayList playlist;

    protected MusicPlayer(String brand, String model) {
        super(brand, model);
        this.currentSong = 0;
        this.playlist = new PlayList();

    }

    @Override
    protected void initializeBaseMediaDevice() {
        playlist.initSongList(5);

    }

    public void addNewSongToPlaylist(Song song){
        playlist.addSong(song);
    }
    private class PlayList {

        Song[] songs;
        static final int CAPACITY = 10;

        public PlayList() {
            songs = new Song[CAPACITY];
        }
        public Song[] getSongsFromPlaylist(){
            return songs;
        }

        public void addSong(Song song) {
            if (checkFreeSlots()>=0){
                songs[checkFreeSlots()] = song;
                System.out.println("New song added to playlist!");
            }else {
                System.out.println("Playlist is full, unable to add new song!");

            }

        }

        private int checkFreeSlots() {
            int idx = 0;
            for (Song song : songs) {
                if (song == null) {
                    return idx;
                }else {
                    idx++;
                }
            }
            return -1;
        }

        void removeSong(int songIdxPosition){
            if(songIdxPosition > 0 && songIdxPosition < songs.length){
                if (songs[songIdxPosition] == null){
                    System.out.println("Nothing to remove from that position");
                }else {
                    songs[songIdxPosition] = null;
                    System.out.println("Song from idx position " + songIdxPosition + " removed from playlist!");
                }
            }
        }
        void initSongList(int numSongs){
            if (numSongs < songs.length){
                for (int k=0; k<numSongs; k++){
                    songs[k] = new Song("Song: "+k, "Artist: " +k);
                }
                System.out.println("Playlist initialized!");
            }
        }

        @Override
        public String toString() {
            return "PlayList{" +
                    "songs=" + Arrays.toString(songs) +
                    '}';
        }
    }




    @Override
    public void play() {
        System.out.println("Playing song in playlist: " + currentSong);

    }

    @Override
    public void pause() {
        System.out.println("Pause on the song: " + currentSong);
    }

    @Override
    public void stop() {
        System.out.println("Stop playing on: " + this.getClass().getSimpleName());

    }

    @Override
    public void next() {
        if (currentSong == playlist.getSongsFromPlaylist().length -1){
            this.currentSong = 1;
            System.out.println("Going to the first song!");

        }else {
            this.currentSong++;
            System.out.println("Going to the next song.");

        }

    }

    @Override
    public void previous() {
        if (currentSong == 1){
            currentSong = playlist.getSongsFromPlaylist().length -1;
            System.out.println("Going to the last song");
            } else {
            currentSong--;
            System.out.println("Going to the next song!");
        }

    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "currentSong=" + currentSong +
                ", playlist=" + playlist +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
