import java.util.*;
public class Vararg {
	void method (int...H) {
		for(int i:H) {
		System.out.println(i);}
	}
	void fruits(String...J) {
		for(String k:J) {
		System.out.println(k);}
	}
	public static void main(String [] args) {
		Vararg var=new Vararg();
		var.method(89,22,46);
		var.fruits("apple","orrange");
	}

}
