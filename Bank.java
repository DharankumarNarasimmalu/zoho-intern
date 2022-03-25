package bankaccount;
import java.util.Scanner;
import java.io.Console;
class Accountholder127{
	String Name="Dharankumar";
	long accountNo=123456789l;
	String bank="Central bank of India";
	String branch="Kondur";
	int balance=2000;
	void getdetails() {
		
	}
	void setdetails(){
		
	}
	void deposit(int a) {
		balance+=a;
	    System.out.println("your account balance: "+balance);
	}
	void withdraw(int a) {
		balance-=a;
		if (balance<=0){
			System.out.println("sorry!your balance is not enough");
		}
		else {
		System.out.println("your account balance: "+balance);}
	}
	
}
public class Bank {
	public static void main(String...args) {
		Console C=System.console();
		String Username=C.readLine("enter username");
		char[]pass=C.readPassword("enter password");
		String password=String.valueOf(pass);
                System.out.println(password);
		if ((Username.equals("dharankumar"))&&(password.equals("123"))){
			Accountholder127 account=new Accountholder127();
			System.out.println("enter 1 to deposit"+'\n'+"enter 2 to withdraw");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			
			if (option==1) {
				System.out.println("enter ammount");
                                account.deposit(sc.nextInt());
			}
			else if (option ==2) {
				System.out.println("enter ammount");
				account.withdraw(sc.nextInt());
			}
		}
		
	}

}
