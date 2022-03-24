package encapsulation;
import java.util.*;
class Details{
	private String name;
	private long Accountno;
	private String bank;
	private int PIN;
	public void setval(String name2,long AC,String Bank,int PIN){
		this.name=name2;
		this.Accountno=AC;
		this.bank=Bank;
		this.PIN=PIN;
		
	}
	public void getval() {
		System.out.println(name+" "+Accountno+" "+PIN);
	}	
}
public class Bankdetails {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long Accountno=4589622254l;
		String Name=sc.nextLine();
		String Bank=sc.nextLine();
		int PIN=sc.nextInt();
	    Details details=new Details();
		details.setval(Name,Accountno,Bank,PIN);
	    details.getval();
	}

}
