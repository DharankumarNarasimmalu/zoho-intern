package busreservation;
import java.util.*;
class Busdetails {
	static  Map<Integer, Integer> AC=new HashMap<Integer,Integer>();
	static Map<Integer, Integer> NONAC=new HashMap<Integer,Integer>();
	void addval() {
		AC.put(121,50);
		AC.put(122,50);
		AC.put(123,50);
		AC.put(124,50);
		AC.put(125, 0);
		NONAC.put(125,50);
		NONAC.put(121,50);
		NONAC.put(122,50);
		NONAC.put(123,50);
		NONAC.put(124,50);
		NONAC.put(125,50);
	}
	void setdata(){
		System.out.println("Enter bus number");
		Scanner sc=new Scanner(System.in);
		int busNo=sc.nextInt();
		System.out.println("Enter number of seats");
		int NOSeats=sc.nextInt();
		System.out.println("enter 1 if BUS is AC or press 0 if BUS is NONAC");
		int Type=sc.nextInt();
		if (Type==1) {
			AC.put(busNo,NOSeats);
		}
		else if (Type==0) {
			NONAC.put(busNo,NOSeats);
		}
	}
	void getdata() {
		System.out.println("AC BUSES");
		for(Map.Entry e:AC.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("NON AC BUSES");
		for(Map.Entry e:NONAC.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
class Customerdetails extends Busdetails{
	String PassengerName;
	int Age;
	int busno;
	int seatNO;
	String d;
	int ACorNOT;
	Date date;
	void setval(String name,int age,int busno,int seatno,String dateinput,int  AC) {
		this.PassengerName=name;
		this.Age=age;
		this.busno=busno;
		this.seatNO=seatno;
		this.d=dateinput;
		this.ACorNOT=AC;
	}
	public void check() {
		if (ACorNOT==1){
			if (AC.get(busno)!=0){
				System.out.println("thankyou for booking your ticket is conformed");
				int A =AC.get(busno);
			    AC.put(busno,A-1);
			}
			else{
				System.out.println("Sorry! there is no more seats in bus");
			}
		}
		else if (ACorNOT==0) {
			if (NONAC.get(busno)!=0){
				System.out.println("thankyou for booking your ticket is conformed");
				int A =NONAC.get(busno);
			    NONAC.put(busno,A-1);
			}
			else{
				System.out.println("Sorry! there is no more seats in bus");
			}
		}
		else {
			System.out.println("your code is not working");
		}
		
		
	}
}
public class Bus  {
	public static void main(String...args) {
		System.out.println("Welcoem to travellers"+'\n'+"press 1 for admin or press 0 for customer");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Busdetails bd=new Busdetails();
		bd.addval();
		Customerdetails cd=new Customerdetails();
		if (N==1) {
			int function=sc.nextInt();
			System.out.println("enter 1 to fetch data or press 0 to enter the data");
			if (function==1) {
				bd.getdata();
			}
			else if(function==0) {
				bd.setdata();
			}
		}
		else if (N==0) {
			System.out.println("Thankyou for choosing our travels");
			System.out.println("enter name");
			String Name=sc.next();
			System.out.println("enter your age");
			int Age=sc.nextInt();
			System.out.println("enter bus number");
			int busno=sc.nextInt();
			System.out.println("enter prefered seat number");
			int seatno=sc.nextInt();
			System.out.println("enter travelling date");
			String Date=sc.next();
			System.out.println("enter yes if AC or enter NO is NONAC");
			int AC=sc.nextInt();
			cd.setval(Name,Age,busno,seatno,Date,AC);
			cd.check();
		}
		
	}
}