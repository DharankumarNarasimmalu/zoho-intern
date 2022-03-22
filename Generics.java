
class Hello<T,U>{
	T obj1;
	U obj2;
	void welcome(T inte ,U string) {
		System.out.println(string+" "+inte);
		System.out.println(inte);
	}
}
public class Generics {
	public static void main(String [] args) {
		Hello<Integer,String> hello=new Hello<>();
		hello.welcome(45,"Dharan");
		
	}

}
