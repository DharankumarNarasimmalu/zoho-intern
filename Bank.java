package AtmMachine;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class User{
	 String name;
	 String accountNo;
	User(String[] details){
		this.name=details[1];
		this.accountNo=details[0];
	}
	
	int changePin(int pin){
		Scanner sc=new Scanner(System.in);
		int newPin = 0;
		System.out.print("Enter old pin: ");
		int oldPin=sc.nextInt();
		if(oldPin==pin) {
			System.out.print("New pin: ");
			newPin=sc.nextInt();
		}
		return newPin;
	}
	
	String  changeMobileNo(){
		System.out.println("Enter New mobile number");
		Scanner sc=new Scanner(System.in);
		String newMobileNo=sc.nextLine();
		return newMobileNo;
		
	}
	
	String changeName() {
		System.out.println("Enter Name");
		Scanner sc=new Scanner(System.in);
		String newName=sc.nextLine();
		this.name=newName;
		return newName;
		
	}
}

class Transaction{
	
	double balance;
	Transaction(String balance) {
		this.balance=Double.parseDouble(balance);
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
	
	void balanceEnq() {
		System.out.println("Balance USD"+balance);
	}
	
	void swipe() {
		Scanner sc=new Scanner (System.in);
		System.out.print("Swipe ");
		int amount=sc.nextInt();
		System.out.println("Cashback USD "+(amount*0.01));
		balance=(balance-amount)+(amount*0.01);
		System.out.println("Balance USD"+balance);
	}
	
	String logut() {
		String bal=String.valueOf(balance);
		return bal;
	}

}
public class Bank {
	public static void main(String...args) {
	    Scanner sc=new Scanner(System.in);
	    List<String[]>userDetails=new ArrayList<>();
	    String user1[]={"123456789","Dharan","9876543217","5000"};
		String user2[]= {"987564321","Kumar","4567892138","10000"};
		String user3[]= {"159753654","Karthic","7412589635","50000"};
		String user4[]= {"639528417","Rahul","1549753654","80000"};
		userDetails.add(user1);
		userDetails.add(user2);
		userDetails.add(user3);
		userDetails.add(user4);
		HashMap<String,Integer>pin=new HashMap<>();
		pin.put("123456789", 1234);
		pin.put("987564321", 5678);
		pin.put("159753654",1011);
		pin.put("639528417",1213);
		while(true) {
		String details[]=new String [4];
		System.out.println("Enter card number");
		String accountNo=sc.next();
		if(pin.containsKey(accountNo)==false) {
			System.out.println("Invalid card number");
			continue;
		}
		int check=0;
		for(String [] s:userDetails) {
			if(accountNo.equals(s[0])) {
				System.out.println("Enter password");
				int password=sc.nextInt();
				if(pin.get(s[0])==password) {
				    for(int i=0;i<4;i++) {
					    details[i]=s[i];
				    }
				}
				else {
					System.out.println("Please check your passsword");
					check=1;
				}
				break;
			}
		}
		if(check==1) {
			continue;
		}
		User user=new User(details);
		Transaction trans=new Transaction(details[3]);
		boolean login=true;
		while(login) {
		System.out.println("Welcome "+details[1]);

		System.out.println("PRESS 1 TO CHANGE DETAILS\nPRESS 2 FOR TRANSACTION\n PRESS 3 TO LOGOUT");
		int commend=sc.nextInt();

		if(commend==1) {
			System.out.println("PRESS 1 TO CHANGE PIN\nPRESS 2 TO CHANGE MOBILE NUMBER\nPRESS 3 TO CHANGE NAME\nPRESS 4 TO CANCEL");
			int innerCommend=sc.nextInt();

			switch(innerCommend) {
			case(1):
				pin.put(details[0],user.changePin(pin.get(details[0])));
			    break;
			case(2):
				details[2]=user.changeMobileNo();
			    break;
			case(3):
				details[1]=user.changeName();
			    break;
			case(4):
				System.out.println("Thanks for visiting our Bank");
			for(int i=0;i <userDetails.size();i++) {
				if(accountNo.equals(userDetails.get(i)[0])) {
					System.out.println("looping is working fine");
					userDetails.set(i,details);
					break;
					}
				}
//			for(String s[]:userdetails) {
//				for(int i=0;i<4;i++) {
//					System.out.print(s[i]+" ");
//				}
//				System.out.println();
//			}
			    login=false;
			    break;
			default:
				System.out.println("invalid commend");
			
			}
				
		}
		else if(commend==2) {
			System.out.println("PRESS 1 FOR WITHDRAW||PRESS 2 FOR DEPOSIT||PRESS 3 FOR BALANCE ENQUIRY||PRESS 4 FOR SWIPE");
			int innerCommend=sc.nextInt();
			switch(innerCommend) {
			case(1):
			    trans.withdraw();
			    break;
			case(2):
				trans.deposit();
			    break;
			case(3):
				trans.balanceEnq();
			    break;
			case(4):
				trans.swipe();
			    break;
			case(6):
				System.out.println("Thanks for visiting our ATM");
			    details[3]=trans.logut();
			    for(int i=0;i <userDetails.size();i++) {
					if(accountNo.equals(userDetails.get(i)[0])) {
						userDetails.set(i,details);
						break;
						}
					}
//				for(String s[]:userDetails) {
//					for(int i=0;i<4;i++) {
//						System.out.print(s[i]+" ");
//					}
//					System.out.println();
//				}
				login=false;
			    
				break;
			default:
				System.out.println("Invalid option");
			}
				
		}
		else if(commend==3) {
			System.out.println("your account has been logged out");
			for(int i=0;i <userDetails.size();i++) {
				if(accountNo.equals(userDetails.get(i)[0])) {
					userDetails.set(i,details);
					break;
					}
				}
			login=false;
		}
		
	}}

}}
