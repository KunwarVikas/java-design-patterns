package main.com.kunwar.designpatterns.structural.adapter;

/**
 * @author Kunwar
 */
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
      audioPlayer.play("mp3", "song1.mp3");
      audioPlayer.play("mp4", "song2.mp4");
      audioPlayer.play("vlc", "song3.vlc");
      audioPlayer.play("avi", "song4.avi");
   }
}