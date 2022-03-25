package polymorphism;
import java.util.Scanner;
interface Game{
	void gamerecords();
}
class Cricket implements Game{
	public void gamerecords() {
		System.out.println("Score	Team	Date\r\n"
				+ "438–9 (49.5 overs)	South Africa	12 March 2006\r\n"
				+ "372–6 (49.2 overs)	South Africa	5 October 2016\r\n"
				+ "364–4 (48.4 overs)	England	20 February 2019\r\n"
				+ "362–1 (43.3 overs)	India	16 October 2013");
	}
}
class Football implements Game{
	public void gamerecords() {
		System.out.println("Record	Player	Details\r\n"
				+ "'Player who has scored the most official goals for a single club'	Lionel Messi	672 goals for Barcelona\r\n"
				+ "'The world's all-time goalscorer according to the Guinness Book of World Records and FIFA'	Pelé	1,284 goals in 1,315 games");
	}
	
}
class Hockey implements Game{
	public void gamerecords() {
		System.out.println("Wayne Gretzky\r\n"
				+ "Wayne Gretzky holds or shares 61 records listed in the League's Official Guide and Record Book: "+'\n'
				+ "40 for the regular season, 15 for the Stanley Cup playoff and six for the All-Star Game.");
	}
}
public class Sports {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String game=sc.nextLine();
		Game G;
		if (game.equals("cricket")) {
			G=new Cricket();
			G.gamerecords();
		}
		else if (game.equals("football")) {
			G=new Football();
			G.gamerecords();
		}
		else if (game.equals("hockey")) {
			G=new Hockey();
			G.gamerecords();
		}
		
	}

}
