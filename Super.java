package superExample;

import java.util.Scanner;
class SuperParent{
	void print() {
		System.out.println("Iam super parent class");
	}
}
class Parent{
	void print() {
		System.out.println("Iam imediate parent class");
	}
}
class Child extends Parent{
	void print(){
		System.out.println("Iam child class");
	}
	void show(){
	super.print();//if we use super it invokes the method in imediate  parent class
	System.out.println("Print statement inside show method");
	this.print();//it invokes current class
	}
}
public class Super {
	public static void main(String...args) {
		Child c=new Child();
		c.show();
		
		
	}

}
