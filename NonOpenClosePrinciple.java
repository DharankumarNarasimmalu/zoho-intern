package solid;
import java.util.*;
class MoneyConversion{
	double amount;
	MoneyConversion(double amount){
		this.amount=amount;
	}
	void dollerToRupee() {
		System.out.println(76.22*amount);
	}
	void rupeeToDoller() {
		System.out.println(amount/76.22);
	}
	void euroToRupee() {
		System.out.println(83.96*amount);
	}
	void rupeeToEuro() {
		System.out.println(amount/83.96);
	}
}
public class NonOpenClosePrinciple {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		String convertionMethod=sc.nextLine();
		MoneyConversion conversion=new MoneyConversion(amount);
		switch(convertionMethod) {
		case("d-r"):
			conversion.dollerToRupee();
		    break;
		case("e-r"):
			conversion.euroToRupee();
		    break;
		case("r-d"):
			conversion.rupeeToDoller();
		    break;
		case("r-e"):
			conversion.rupeeToEuro();
		    break;
		
		}
		
	}

}
