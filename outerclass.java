import java.util.*;
public class outerclass {
	public class inner{
		void method () {
			System.out.println("hello");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		outerclass.inner h=new outerclass().new inner();
		h.method();
	}

}
