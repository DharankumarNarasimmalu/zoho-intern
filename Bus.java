package busreservstion;
import java.util.*;
class User{
	String customername;
	String busNo;
	int seatNo;
	String date;
	int totalSeatsInBus;
	User(String name,String busno,int seatno,String date,int totalSeats){
		customername=name;
		busNo=busno;
		seatNo=seatno;
		this.date=date;
	    totalSeatsInBus=totalSeats;
	}
//	void display() {
//		System.out.println(customername+busNo+seatNo+date+totalSeatsInBus);
//	}
}
class Reservation extends User{
	Reservation(String name,String busno,int seatno,String date,int totalSeats) {
		super(name,busno,seatno,date,totalSeats);
	}
	void check() {
//		System.out.println("press 1 to reserve ticket press 0 to cancel ticket");
//		int option=sc.nextInt();
		
		if (totalSeatsInBus==0) {
			System.out.println("Sorry!Tickets are sold out");
			
		}
		else {
			reserve();
		}
	}
	void reserve() {
		System.out.println("your ticket was confirmed");
		totalSeatsInBus-=1;
		printSlip();
		
	}
	void cancelTicket() {
		System.out.println("your ticket was cancelled");
		totalSeatsInBus+=1;
	}
	void printSlip() {
		System.out.println("customername: "+customername +'\n'+"Bus number"+busNo+'\n'+"Seat Numebr"+seatNo+'\n'+date);
	}
}
class Remainder{
	
}
public class Bus {
	public static void main(String...args) {
		Map<String,Integer>buses=new HashMap<>();
		buses.put("105",50);
		buses.put("106", 50);
		buses.put("179",0);
		boolean reservation=true;
		while(reservation) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to book ticket || press 0 to cancel ticket || press 2 to exit");
		int option=sc.nextInt();
		if (option==2) {
			return;
		}
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter bus ID");
		String busId=sc.next();
		System.out.println("Enter Bus Number");
		int busNo=sc.nextInt();
		System.out.println("Enter date");
		String date=sc.next();
		if (option==2){
			return;
		}
		
		else if (option==0){
			Reservation rev=new Reservation(name,busId,busNo,date,buses.get(busId));
			rev.cancelTicket();
		}
		else if (option==1){
			User customer=new User(name,busId,busNo,date,buses.get(busId));
			Reservation rev=new Reservation(name,busId,busNo,date,buses.get(busId));
			rev.check();
		}}
//		List<String[]>user=new ArrayList<>();
//		String[]user1= {"Dharan","105","45","05/02/2002"};
//		String[]user2= {"Kumar","106","32","05/04/2002"};
//		String[]user3= {"Karthic","179","16","05/05/2002"};
//		user.add(user1);
//		user.add(user2);
//		user.add(user3);
//		Map<String,Integer>buses=new HashMap<>();
//		buses.put("105",50);
//		buses.put("106", 50);
//		buses.put("179",0);
//		for(String[] s:user) {
//			User customer=new User(s,buses.get(s[1]));
//			Reservation rev=new Reservation(s,buses.get(s[1]));
//			rev.check();
//			customer.display();
//		System.out.println("Enter name");
//		String name=sc.nextLine();
//		System.out.println("Enter bus ID");
//		String busId=sc.nextLine();
//		System.out.println("Enter Bus Number");
//		int busNo=sc.nextInt();
//		System.out.println("Enter date");
//		String date=sc.next();
//		User customer=new User(name,busId,busNo,date,buses.get(busId));
//		Reservation rev=new Reservation(name,busId,busNo,date,buses.get(busId));
//		rev.check();
		}
	}

