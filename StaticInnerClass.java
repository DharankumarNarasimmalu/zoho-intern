
public class StaticInnerClass {
	static class Inner{
		public static void print() {
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.Inner N=new StaticInnerClass.Inner();
		N.print();
		
		
	}

}
