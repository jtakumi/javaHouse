import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class ClipSound {
  
       public static void main(String[] args) throws Exception {
       
              AudioInputStream audioStream = AudioSystem
                               .getAudioInputStream(ClipSound.class.getResourceAsStream("altu.wav"));
              
              AudioFormat format = audioStream.getFormat();
              DataLine.Info info = new DataLine.Info(Clip.class, format);
              Clip line = (Clip) AudioSystem.getLine(info);
              line.open(audioStream);
              line.start();
              
              line.drain();
              line.close();
              
             System.exit(0);
         }
} 