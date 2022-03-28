package ottplatform;
import java.io.Console;
import java.util.*;
class User{
	String name;
	int plan;
	Plan plandetails;
	public User(String name, int plan,Plan p) {
		this.name=name;
		this.plan=plan;
		this.plandetails=p;
	}
	void display() {
		System.out.println("NAME: "+name+'\n'+"PLAN: "+plan);
	}
	//Check the plan according to paid amount
	void check() {
		if (plan==999) {
			plandetails.superplan();
		}
		else if (plan==499) {
			plandetails.betterplan();
		}
		else if (plan==799) {
			plandetails.mediumplan();
		}
		else if(plan==199) {
			plandetails.basicplan();
		}
	}
}
class Plan{
	public List<String>Str=new ArrayList<String>();
	public void add(String s) {
		Str.add(s);
	}
	void superplan(){
		System.out.println("Choose your favourite movie by pressing id number");
		Scanner sc=new Scanner(System.in);
		int planno=sc.nextInt();
		if (planno<=5) {
			Movie m=new Movie(Str.get(planno));
			m.play();
			System.out.println("press 0 to play || press 1 to pause || Press 2 to stop ");
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m.stop();
					break;}
			    else if (action==1) {
			    	m.pause();
			    	continue;	
				}
			}
		}
		else {
			System.out.println("invalid number");
		}
	}
	void betterplan() {
		System.out.println("Choose your favourite movie by pressing id number");
		Scanner sc=new Scanner(System.in);
		int planno=sc.nextInt();
		if (planno<=4) {
			Movie m=new Movie(Str.get(planno));
			m.play();
			System.out.println("press 0 to play || press 1 to pause || Press 2 to stop ");
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m.stop();
					break;}
			    else if (action ==1) {
			    	m.pause();
			    	continue;
			    	
				}
			}
		}
		else {
			System.out.println("invalid number");
		}
		
		
	}
	void mediumplan() {
		System.out.println("Choose your favourite movie by pressing id number");
		Scanner sc=new Scanner(System.in);
		int planno=sc.nextInt();
		if (planno<=3) {
			Movie m=new Movie(Str.get(planno));
			m.play();
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m.stop();
					break;}
			    else if (action ==1) {
			    	m.pause();
			    	continue;
			    	
				}
			}
		}
		else {
			System.out.println("invalid number");
		}
	
		
	}
	void basicplan() {
		System.out.println("choose your favourite movie by pressing id number");
		Scanner sc=new Scanner(System.in);
		int planno=sc.nextInt();
		if (planno<=3) {
			Movie m=new Movie(Str.get(planno));
			m.play();
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m.stop();
					break;}
			    else if (action ==1) {
			    	m.pause();
			    	continue;
			    	
				}
			}
		}
		else {
			System.out.println("invalid number");
		}
	}
}
class Movie{
	String moviename;
	Movie(String moviename){
		this.moviename=moviename;
	}
	void play() {
		System.out.println("|PLAY|"+moviename);
	}
	void pause() {
		System.out.println("|PAUSE|"+moviename);
	}
	void stop() {
		System.out.println("|STOP|"+moviename);
	}
}
public class Amazonprime {
	public static void main(String...args) {
		// map to get user name and plan
		Map<String,Integer>user=new HashMap<>();
		user.put("Dharan",999);
		user.put("Kumar",499);
		user.put("Raj",199);
		user.put("Karthic",799);
		//Array list to get movie name
		List<String>movie=new ArrayList<>();
		movie.add("ET");
		movie.add("Maran");
		movie.add("Kaithi");
		movie.add("Maanadu");
		movie.add("IPL");
		Plan p=new Plan();
		for(int i=0;i<5;i++) {
			p.add(movie.get(i));
		}
		// Map to get the userid and password
		Map<String,String>pass=new HashMap<>();
		pass.put("Dharan","123");
		pass.put("Kumar","784");
		pass.put("Raj","789");
		pass.put("Karthic","456");
		//console statement
		Console c=System.console();
		String username=c.readLine("Enter username");
	    char[]ch=c.readPassword("enter password: ");
		String password=String.valueOf(ch);
		System.out.println(password);
		if (password.equals(pass.get(username))){
			System.out.println("Welcome "+username);
			User user1=new User(username,user.get(username),p);
			user1.display();
			user1.check();
		}
		else {
			System.out.println("Please check you user name or password");
		}
	}
}
