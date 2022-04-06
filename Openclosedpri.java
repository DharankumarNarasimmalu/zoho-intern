package solid;
import java.util.Scanner;
interface Currency{
	double Convertor(float rupee);
}
class DollertoRupee implements Currency {
	public double Convertor(float N) {
		return 76.22*N;
	}
}
class RupeetoDoller implements Currency {
	public double Convertor(float N) {
		return N/76.22;
	}
}
class EurotoRupee implements Currency {
	
	
	public double Convertor(float N) {
		return 83.96*N;
	}
}
class RupeetoEuro implements Currency {
	public double Convertor(float N) {
		return N/83.96;
	}
}
public class Openclosedpri{
	public static void main(String...args) {
		
		Scanner sc=new Scanner(System.in);
		float Rupee=sc.nextFloat();
		System.out.println("Currency form-Currency to"
				+ "");
		String from=sc.next();

		Currency C;
		switch(from) {
		case("d-r"):
			C=new DollertoRupee();
		    System.out.println(C.Convertor(Rupee));
		    break;
		case("e-r"):
			C=new DollertoRupee();
		    System.out.println(C.Convertor(Rupee));
		    break;
		case("r-d"):
			C=new DollertoRupee();
		    System.out.println(C.Convertor(Rupee));
		    break;
		case("r-e"):
			C=new DollertoRupee();
		    System.out.println(C.Convertor(Rupee));
		    break;
		
		}
		}
}
