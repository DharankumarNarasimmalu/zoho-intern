package thisExample;

import java.util.Scanner;
class SuperParent{
	void print() {
		System.out.println("Iam super parent class");
	}
}
class Parent extends SuperParent{
//	void print() {
//		System.out.println("Iam imediate parent class");
//	}
}
class Child extends Parent{
//	void print(){
//		System.out.println("Hello Google");
//	}
	void show(){
	super.print();//if we use super it invokes the method in imediate  parent class
	System.out.println("Iam child class");
	this.print();//it invokes current class or invoke imediate parent class is method not in current class
	}
}
public class Main {
	public static void main(String...args) {
		Child c=new Child();
		c.show();
		
		
	}

}
