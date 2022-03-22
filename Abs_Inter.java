import java.util.*;
interface Inter{
	static final int var=88;//we can declare variabe in interface but it should be static final we cant change it
	static final int var2=66;
	int cal();
}
class add implements Inter{
	public int cal() {
		return var+var2;
	}
}
class sub implements Inter{
	public int cal() {
		return var-var2;
	}
}
class mul implements Inter{
	public int cal() {
		return var*var2;
	}
}
class div implements Inter{
	public int cal() {
		return var/var2;
	}
}
public class Abs_Inter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		Inter A;
		switch(S) {
		case("add"):
			A=new add();
		    System.out.println(A.cal());
		    break;
		case("sub"):
			A=new sub();
		    System.out.println(A.cal());
		    break;
	    case("mul"):
	    	A=new mul();
	        System.out.println(A.cal());
	        break;
			
		}
	}

}
