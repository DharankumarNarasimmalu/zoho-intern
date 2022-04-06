package solid;
import java.util.Scanner;
interface Calculation{
	public void calculate(int num1,int num2);
}
class Add implements Calculation{

	public void calculate(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
}
class Sub implements Calculation{
	public void calculate(int num1,int num2) {
		System.out.println(num1-num2);
	}
}
class Mul implements Calculation{
	public void calculate(int num1,int num2) {
		System.out.println(num1*num2);
	}
}
class Div implements Calculation{
	public void calculate(int num1,int num2) {
		System.out.println(num1*num2);
	}
}
public class OpenClosedPrinciple {
	public static void main(String...args) {
		Calculation cal;
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		String symbol=sc.next();
		int num2=sc.nextInt();
		switch(symbol) {
		case("+"):
			cal= new Add();
		    cal.calculate(num1,num2);
		    break;
		case("-"):
			cal=new Sub();
		    cal.calculate(num1, num2);
		    break;
		case("*"):
			cal=new Mul();
		    cal.calculate(num1,num2);
		    break;
		case("/"):
			cal=new Div();
		    cal.calculate(num1, num2);
		    break;
	    default:
	    	System.out.println("Invalid commend");
		    
		}
		
	}

}
