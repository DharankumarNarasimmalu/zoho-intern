package solid;
import java.util.*;
interface AudioPlayer{
	void playingAudio();
}
interface VideoPlayer{
	void playingVideo();

}
class Songs implements AudioPlayer{

	@Override
	public void playingAudio() {
		System.out.println("Playing music");
		
	}
	
}
class Movie implements AudioPlayer,VideoPlayer{

	@Override
	public void playingVideo() {
		System.out.println("playinvideo");
	}

	@Override
	public void playingAudio() {
		System.out.println("playing audio");
	}
	
}
class Cartoon implements AudioPlayer,VideoPlayer{

	@Override
	public void playingVideo() {
		System.out.println("playinvideo");
		
	}

	@Override
	public void playingAudio() {
		System.out.println("playing audio");
		
		
	}
	
}
public class InterfaceSegPri {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to play Movie||press 2 to play Cartoon||Press 3 to play Songs");
		int commend=sc.nextInt();
		VideoPlayer videoplayer;
		AudioPlayer audioplayer;
		switch(commend) {
		case(1):
			videoplayer=new Movie();
		    videoplayer.playingVideo();
		    audioplayer=new Movie();
		    audioplayer.playingAudio();
		    break;
		case(2):
		    videoplayer=new Cartoon();
	        videoplayer.playingVideo();
	        audioplayer=new Cartoon();
	        audioplayer.playingAudio();
	        break;
		case(3):
			audioplayer=new Songs();
		    audioplayer.playingAudio();
		    break;
		}
	}

}
