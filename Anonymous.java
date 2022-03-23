interface Cal{
	void add();
}
public class Anonymus {
	public static void main(String[]args) {
		int a=8;
		int b=8;
		 Cal C=new Cal(){
			 public void add(){
			System.out.println(a+b);}};
		 C.add();
	}

}

