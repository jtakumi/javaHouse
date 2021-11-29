 public class Owner {
    public static void main(String[] args) {
        AudioPlayer myAudioPlayer = new AudioPlayer();
        VideoPlayer myVideoPlayer = new VideoPlayer();
        AVPlayer myAVPlayer = myAudioPlayer;
        myAVPlayer.play();
      }
      
 }