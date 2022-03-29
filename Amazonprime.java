
import java.io.Console;
import java.util.*;
class User{
	String name;
	int planamount;
	Plan plandetails;
	public User(String name, int plan,Plan p) {
		this.name=name;
		this.planamount=plan;
		this.plandetails=p;
	}
	void display() {
		System.out.println("NAME: "+name+'\n'+"PLAN: "+planamount);
	}
	//Check the plan according to paid amount
	void check() {
		if (planamount==999) {
			plandetails.superplan();
		}
		else if (planamount==499) {
			plandetails.betterplan();
		}
		else if (planamount==799) {
			plandetails.mediumplan();
		}
		else if(planamount==199) {
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
			Movie.moviename=Str.get(planno);
			Movie m;
			m=new Play();
			m.action();
			Movie.moviename=Str.get(planno);
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m=new Stop();
					m.action();
					break;}
			    else if (action ==1) {
			    	m=new Pause();
			    	m.action();
			    	continue;	
				}
			    else if (action==0) {
			    	m=new Play();
			    	m.action();
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
			Movie.moviename=Str.get(planno);
			Movie m;
			m=new Play();
			m.action();
			Movie.moviename=Str.get(planno);
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m=new Stop();
					m.action();
					break;}
			    else if (action ==1) {
			    	m=new Pause();
			    	m.action();
			    	continue;	
				}
			    else if (action==0) {
			    	m=new Play();
			    	m.action();
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
			Movie.moviename=Str.get(planno);
			Movie m;
			m=new Play();
			m.action();
			Movie.moviename=Str.get(planno);
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m=new Stop();
					m.action();
					break;}
			    else if (action ==1) {
			    	m=new Pause();
			    	m.action();
			    	continue;	
				}
			    else if (action==0) {
			    	m=new Play();
			    	m.action();
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
			Movie.moviename=Str.get(planno);
			Movie m;
			m=new Play();
			m.action();
			Movie.moviename=Str.get(planno);
			int action=sc.nextInt();
			while(true) {
				action=sc.nextInt();
				if (action==2) {
					m=new Stop();
					m.action();
					break;}
			    else if (action ==1) {
			    	m=new Pause();
			    	m.action();
			    	continue;	
				}
			    else if (action==0) {
			    	m=new Play();
			    	m.action();
			    	continue;
			    }
			}
		}
		else {
			System.out.println("invalid number");
		}
	}
}
abstract class Movie{
	static String moviename;
//	static void setMethod(String moviename1){
//		moviename=moviename1;}
	abstract void  action();
	}
class Play extends Movie {
	void action() {
		System.out.println("|PLAY|"+moviename);
	}}
class Pause extends Movie{
	void action() {
		System.out.println("|PAUSE|"+moviename);
	}}
class Stop extends Movie{
	void action() {
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
		List<String>Series=new ArrayList<>();
		Plan p=new Plan();
		for(int i=0;i<5;i++){
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
