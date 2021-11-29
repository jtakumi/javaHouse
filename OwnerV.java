 public class OwnerV {
    public static void main(String[] args) {
        AudioPlayer myAudioPlayer = new AudioPlayer();
        VideoPlayer myVideoPlayer = new VideoPlayer();
        AVPlayer myAVPlayer = myVideoPlayer;
        myAVPlayer.play();
      }
      
 }