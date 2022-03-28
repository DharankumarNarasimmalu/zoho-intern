package composition2;
import java.util.*;
class Office{
	String name;
	String location;
	Address a;
	Office(String Name,String location,Address a){
		this.name=Name;;
		this.location=location;
		this.a=a;
	}
	public void display() {
		System.out.println(name+" "+location);
		a.print();
	}
	
}
class Address{
	String address;
	public Address(String S) {
		address=S;
	}
	void print() {
		System.out.println(address);
	}
	
}
public class Comp {
	public static void main(String...args) {
		Address a=new Address("University\r\n"
				+ "151, Great Southern Trunk Rd");
		Address a1=new Address("Corporate office\r\n"
				+ "173, Avvai Shanmugam Salai");
		Address a2=new Address("Software company\r\n"
				+ "44A\r\n"
				+ "088531 66116");
		List<Office>office=new ArrayList<>();
		office.add(new Office("ZOHO UNIVERSITY","Chennai",a));
		office.add(new Office("ZOHO OFFICE","Chennai",a1));
		office.add(new Office("OLD ZOHO OFFICE","Chennai",a2));
		for(Office o:office) {
			o.display();
		}
		
	}
	
	
}
