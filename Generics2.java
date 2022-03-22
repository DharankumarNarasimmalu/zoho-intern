import java.util.*;
public class Generics2 {
	<T>void method(T obj){// used to pass different type of argument
		System.out.println(obj);
	}
	public static void main(String[] args){
		Generics2 gen=new Generics2();
		gen.method ("hello");
		gen.method("Welcome");
		gen.method(26.33);
		
	}
}
