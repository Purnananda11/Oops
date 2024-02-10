import java.util.*;
import java.util.Scanner;

interface MediaPlayer{
   public void play();
   public void pause();
   public void skip();
}
class AudioPlayer implements MediaPlayer
{
    int volumn;
    int track;
    List<String>  playlist = new ArrayList<String>();
   int currentSong=0;


  void setVolumn(int volumn)
  {
      this.volumn = volumn;
  }
    public void addSong(String song)
    {
        playlist.add(song);
    }
    @Override
    public void pause() {
       System.out.println("song is paused "+playlist.get(currentSong));
    }

    @Override
    public void play() {
        System.out.println(playlist.get(currentSong));
    }

    @Override
    public void skip() {
        currentSong = currentSong+1;
        System.out.println("Current playing song is "+playlist.get(currentSong));

    }
    void display_volume()
    {
        System.out.println("Current volumn is "+volumn);
    }
    void display_track()
    {
        System.out.println("Current volumn is "+track);
    }
}


public class InterfaceExample {
    public static void main(String[] args)
    {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.addSong("hello india");
        audioPlayer.addSong("I love you song");
        audioPlayer.addSong("ohh priya");
        Scanner scan = new Scanner(System.in);
       int choice=0;
        while(choice!=4)
        {

            System.out.println("enter 1 to chnage the volumn");
            System.out.println("Enter 2 to display current playing track");
            System.out.println("Enter 3 to skip the playing song");
            System.out.println("Enter 4 to exit the playing song");
            choice = scan.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the volumn you need");
                    audioPlayer.setVolumn( audioPlayer.volumn = scan.nextInt());
                    audioPlayer.display_volume();
                    break;
                case 2:
                    audioPlayer.play();
                    break;
                case 3:
                    audioPlayer.skip();
                    break;
                case 4:
                    System.out.println("Exiting the player");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }

    }

}
