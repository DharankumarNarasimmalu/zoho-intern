import java.util.*;
import java.util.*;
interface Youtube{
	public void youtube();
}
class App implements Youtube{
	public void youtube() {
		System.out.println("install app from playstore and watch video");
	}
}
class browser implements Youtube{
	public void youtube() {
		System.out.println("search in your browser as youtube and watch video");
	}
}
class Youtubeband{
	public static void youtube() {
		System.out.println("Use VPN while use youtube");
	}
}
class polymorphism{
	public static void main(String[] args) {
		Scanner
		
		Youtube yt=new App();
		yt.youtube();
	}
}