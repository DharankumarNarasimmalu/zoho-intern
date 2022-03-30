package thisExample;

import java.util.Scanner;
class SuperMain{
	int b=20;
	int a=30;
	void sum() {
		System.out.println(a+b);
	}
}
class MainClas extends SuperMain{
	int a=10;
	int b=20;
	void sum() {
		System.out.println(a+b);
		System.out.println(super.a+super.b);
	}
}
class Sub extends MainClas{
	int a=50;
	int b=100;
	void sum() {
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
		super.sum();
	}
}
public class PrintStatement {
	public static void main(String...args) {
		Sub sub=new Sub();
		sub.sum();
	}


}
