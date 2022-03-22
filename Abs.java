import java.util.Scanner;
abstract class cal{                    //we cannot extends too many class like interface
	int a;                            //also we can also use non abstract method also in abstract class
	int b;
	void setval(int a,int b) {
		this.a=a;
		this.b=b;
	}
	abstract void print();
}
class addition extends cal{
	void print() {
		System.out.println("sum "+(a+b));
	}
}
class subraction extends cal{
	void print() {
		System.out.println("sub "+(a-b));
	}
}
class multiply extends cal{
	void print() {
		System.out.println("mul "+(a*b));
	}
}
class divition extends cal{
	void print() {
		System.out.println("div "+(a/b));
	}
}
public class Abs {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String S=sc.nextLine();
		switch(S) {
		case("add"):
			addition A=new addition();
		A.setval(a,b);
		    break;
		case("sub"):
			subraction A1=new subraction();
		A1.setval(a,b);
		
		    break;
	    case("mul"):
	    	multiply A2=new multiply();
	    A2.setval(a,b);
	       
	        break;
	    case("div"):
	    	divition A3=new divition();
	    A3.setval(a,b);
	    break;
		}
	}
}
