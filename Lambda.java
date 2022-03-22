abstract class Privacy{
	abstract void details();
}
class Carowner extends Privacy{
	void details() {
		System.out.println("car company: HONDA");
		System.out.println("car Model: city");
		System.out.println("car NUmber: TN32AZ5010");
		System.out.println("car colour: RED");
	}
}
class RTO_office extends Privacy{
	void details() {
		System.out.println("Car owner name: XXXXXXXX");
		System.out.println("Car Number: TN32AZ5010");
		System.out.println("Car Owner NO.: 9876543210");
		System.out.println("Car insurence no: 123456789");
	}
}
class Service extends Privacy{
	void details() {
		System.out.println("car owner name: XXXXXXXXX");
		System.out.println("car model: honda city");
		System.out.println("service id : 456");
		System.out.println("bill amount: Rs.1084");
		
		
	}
}
public class Lambda {
	public static void main(String args[]) {
		Privacy k=new Carowner();
		k.details();
		
	}

}
