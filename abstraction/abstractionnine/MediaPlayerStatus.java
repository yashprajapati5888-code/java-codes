package abstraction.abstractionnine;

public class MediaPlayerStatus {
    public static void main(String[] args) {
        MediaPlayer obj = new MXPlayer();
        MediaPlayer obj1 = new VLCPlayer();

        obj.play();
        obj1.play();
    }
}
