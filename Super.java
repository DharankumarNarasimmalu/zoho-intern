package composition2;
class Main{
	Main(int n,String S){
		
	}
}
class Sub extends Main{

	Sub(int n, String S) {
		super(n, S);
		System.out.println(n+" "+S);
		System.out.println(5+" "+"Kumar");
	}
	
}
public class Super {
	public static void main(String...args) {
		Main m=new Main(2,"Dharan");
		Sub s=new Sub(5, "asd");
	}
}
