package OTT;
import java.util.*;
import java.io.*;
class User457{
	String name="Dharankumar.N";
	int userid=457;
	int plan=999;
	void print() {
		System.out.println(name+'\n'+userid+'\n'+plan);
	}
}
class Plandetails extends User457{
	int validtime;
	Scanner sc=new Scanner (System.in);
	Movie movie=new Movie();
	public void plandetails(){
	if (plan==500) {
		validtime=30;
		int K=sc.nextInt();
		switch(K) {
		case(1):
			movie.maaran();
		    break;
		case(2):
			movie.maanadu();
		    break;
		case(3):
			movie.jaibeam();
		    break;
		case(4):
			movie.kalavani();
		    break;
		default:
			System.out.println("sorry!");
		}
		System.out.println("valid in "+validtime+" days");

	}
	else if(plan==999) {
		validtime=90;
		int K=sc.nextInt();
		switch(K) {
		case(1):
			movie.maaran();
		    break;
		case(2):
			movie.maanadu();
		    break;
		case(3):
			movie.jaibeam();
		    break;
		case(4):
			movie.kalavani();
		    break;
		case(5):
			movie.IPL();
		    }
	    }  
    }
}
class Movie{
	void maaran() {
		System.out.println("your movie|MAARAN| is playing");
	}
	void maanadu() {
		System.out.println("your movie|MAANADU| is playing");
	}
	void jaibeam() {
		System.out.println("your movie|JAIBEAM| is playing");
	}
	void kalavani() {
		System.out.println("your movie|KALAVANI| is playing");
	}
	void IPL() {
		System.out.println("Enjoy with your favourite team in |IPL|");
	}
	}






public class Netflix{
	public static void main(String...args) {
		 Console c=System.console();
		 String username=c.readLine("Enter username");
		 char[]ch=c.readPassword("enter password");
		 String password=String.valueOf(ch);
		 System.out.println("password");
		 if ((username=="Dharankumar" )&&(password=="111")) {
			 Plandetails user=new Plandetails();
			 user.print();
			 user.plandetails();
		 }
		 else {
			 System.out.println("username or password is wrong");
		 }
	}
}
