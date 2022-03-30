package thisExample;
import java.util.Scanner;
class GreateParent{
	GreateParent(int a,int b){
		System.out.println(a+b);
	}
}
class GreateChild extends GreateParent{
	GreateChild(int a,int b){
		super(a,b);
		System.out.println(a+b);
	}
	
}
public class SuperCons {
	public static void main(String...args) {;
	Scanner sc=new Scanner(System.in);
	int a=2;
	int b=3;
	GreateParent p=new GreateParent(a,b);
	GreateChild c=new GreateChild(5,8);
	}	
}
