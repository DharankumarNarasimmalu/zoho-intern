package AtmMachine;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class UserTransaction{
    String name;
	double balance;
	UserTransaction(String[]details) {
		this.name=details[1];
		this.balance=Double.parseDouble(details[2]);
	}
	void showDetails() {
		System.out.println("Welcome: "+name);
	}
	void withdraw() {
		System.out.println("Enter Amount");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if(amount%5==0) {
			balance-=(amount+(amount*0.02));
			if(balance<=100) {
				System.out.println("Sorry!minimum balance is USD 100");
			}
			else {
			System.out.println("Charge USD "+(amount*0.02)+'\n'+"Balance USD"+balance);
			}
		}
		else {
			System.out.println("Please correct the amount of value. It should be multiple of USD 5\npress 2 to go back or "
					+ "press 1 to continue");
			int out=sc.nextInt();
			if(out==1) {
			withdraw();}
			else if(out==2) {
				return;
			}
		}
		
	}
	void deposit() {
		System.out.println("Enter Amount");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		balance+=amount;
		System.out.println("Balance USD "+balance);
	}
	void swipe() {
		Scanner sc=new Scanner (System.in);
		System.out.print("Swipe ");
		int amount=sc.nextInt();
		System.out.println("Cashback USD "+(amount*0.01));
		balance=(balance-amount)+(amount*0.01);
		System.out.println("Balance USD"+balance);
	}
	void balanceEnq() {
		System.out.println("Balance USD"+balance);
	}	
}
public class Atm {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);

		List<String[]>userdetails=new ArrayList<>();
		String user1[]={"123456789","Dharan","5000"};
		String user2[]= {"987564321","Kumar","10000"};
		String user3[]= {"159753654","karthic","50000"};
		String user4[]= {"639528417","Rahul","80000"};
		userdetails.add(user1);
		userdetails.add(user2);
		userdetails.add(user3);
		userdetails.add(user4);
		int check=0;
		String[]details=new String[3];
		while(check==0) {
			System.out.println("Enter card number");
			String accountno=sc.nextLine();
		for(String[] s:userdetails) {
			if(accountno.equals(s[0])) {
				check=1;
				for(int i=0;i<3;i++) {
					details[i]=s[i];
				}
			}
		}
		if(check==0) {
			System.out.println("Invalid card number");
		}
		}
		UserTransaction trans=new UserTransaction(details);	
		trans.showDetails();
		while(true) {
			System.out.println(" BALANCE ENQUIRY PRESS(1)\n WITHDRAW PRESS(2)\n "
					+ "DEPOSIT AMOUNT PRESS(3)\n FOR SWIPE CARD PRESS(4)\n PRESS (5) TO LOGOUT");
		int commend=sc.nextInt();
		switch(commend) {
		case(1):
			trans.balanceEnq();
		break;
		case(2):
			trans.withdraw();
		break;
		case(3):
			trans.deposit();
		break;
		case(4):
			trans.swipe();
		break;
		case(5):
			System.out.println("Thanks for choosing our Bank");
			return;
		}}
	}
}
