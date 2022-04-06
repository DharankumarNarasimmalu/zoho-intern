package solid;
import java.util.Scanner;
class Transaction {
	int balance;
	Transaction(int bal){
		this.balance=bal;
	}
	void withdraw() {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println("Balance: "+(balance-amount));
	}
	void withdraw(String name) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println(amount+"transfred to "+name);
		System.out.println("Balance: "+(balance-amount));
	}
	void deposit() {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println("Balance: "+(balance+amount));
		
	}
	
}
class OnlineTransaction extends Transaction{
	OnlineTransaction(int bal) {
		super(bal);
	}
	void payment() {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		String receiverName=sc.next();
		System.out.println(amount+"payed to "+receiverName);
		
	}
}
class CardTransaction extends Transaction{
	CardTransaction(int bal) {
		super(bal);
	}
	void EMI() {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println("Balance: "+(balance-amount));
		
	}
}
public class LiskovSubstitutionPrinciple {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int balance=50000;
		String name="Kumar";
		Transaction trans=new Transaction(balance);
		OnlineTransaction online=new OnlineTransaction(balance);
		CardTransaction card=new CardTransaction(balance);
		String option=sc.next();
		switch(option) {
		case("onlinetransfer"):
			String receivername=sc.next();
			trans.withdraw(receivername);
		case("onlinepayment"):
			online.payment();
		case("cardwithdraw"):
			trans.withdraw();
		case("EMI"):
			card.EMI();
		case("swipe"):
			trans.withdraw();
		
		}
	}

}
