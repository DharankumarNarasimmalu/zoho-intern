package composition2;
import java.io.Console;
import java.util.*;
class User{
	static protected String username;
	static protected String accountno;
	static protected double balance;
	static protected String phno;
	static protected Action action;
	final String Bankname="CENTRAL BANK OF INDIA";
	public void set(String[] s,Action action)
	{
		username=s[0];
		accountno=s[1];
		balance=Double.parseDouble(s[2]);
		phno=s[3];
		this.action=action;
		}
	public void  check() {
		System.out.println("Welcome to "+Bankname);
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to cash withdraw||press 2 to deposit||"
				+ "press 3 to balanceEnquiry||press 4 to print slip||press 5 to exit");
		
		while(true) {
		int actionNo=sc.nextInt();
		switch(actionNo) {
		case(1):
			action.withdraw();
		    break;
		case(2):
			action.deposit();
		    break;
		case(3):
			action.balanceEnquiry();
		    break;
		case(4):
			action.printSlip();
		    break;
		case(5):
			System.out.println("Exit");
		    return;
		default:
			System.out.println("Invalid commend");
		    }
	    }
	}
}
class Action extends User{
	public void withdraw(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		if (balance<=amount) {
			System.out.println("INSUFFICIENT AMOUNT\nBALANCE: "+super.balance);
		}
		else {
			balance-=amount;
		System.out.println("Your balance amount: "+super.balance);
		}
	}
	public void deposit() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		balance+=amount;
		System.out.println("Your balance amount: "+super.balance);
	}
	public void balanceEnquiry() {
		System.out.println("Your balance amount: "+super.balance);
	}
	public void printSlip() {
		System.out.println("Name: "+super.username+'\n'+"Account number: "+super.accountno+'\n'+"Phone number: "+super.phno+'\n'+"Balance: "+super.balance);
	}
}
public class Bank {
	public static void main(String...args) {
		int newUser=0;
		String user1[]= {"Dharan","123546","2900","9876543210"};
		String user2[]= {"Kumar","654321","4900","0123456789"};
		String user3[]= {"Raj","147258","7900","1475283692"};
		String user4[]= {"Karthic","258654","30000","1595374568"};
		//adding array into the list
		List<String[]>user=new ArrayList<String[]>();
		user.add(user1);
		user.add(user2);
		user.add(user3);
		user.add(user4);
		Map<String,String>pass=new HashMap<>();
		pass.put("Dharan","123");
		pass.put("Kumar","784");
		pass.put("Raj","789");
		pass.put("Karthic","456");
		boolean validusername=true;
		while(validusername) {
		Console c=System.console();
		String username=c.readLine("Enter username: ");
	    char[]ch=c.readPassword("enter password: ");
		String password=String.valueOf(ch);
		System.out.println(password);
		
		try {
			boolean login=true;
		while(login) {
		if (pass.get(username).equals(password)) {
			login=false;
			User accountdetails=new User();
			Action action=new Action();
			for(String[] S:user) {
				if (S[0].equals(username)) {
					accountdetails.set(S,action);
					accountdetails.check();
					break;
				}
			}
		}
		else{
			System.out.println("Invalid Password");
			System.out.println("Press 1 to login again or press 2 to exit");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			if (option==1) {
				login=true;
			}
			else {
				login=false;
			}
			
		}}
		validusername=false;
	}
		catch (NullPointerException e){
			System.out.println("invalid username press 1 to signup||press 0 to end prosess");
			Scanner sc=new Scanner(System.in);
		    newUser=sc.nextInt();
		    sc.nextLine();
		    if (newUser==1) {
				String[] newuser1=new String[4];
				System.out.println("Enter name");
				newuser1[0]=sc.nextLine();
				System.out.println("Account number");
				newuser1[1]=sc.nextLine();
				System.out.println("Balance");
				newuser1[2]=sc.nextLine();
				System.out.println("Enter phone number");
				newuser1[3]=sc.nextLine();
				System.out.println("New password");
				String creatpassword=sc.nextLine();
				user.add(newuser1);
				pass.put(newuser1[0], creatpassword);
				System.out.println("login");
				}
		    else if(newUser==0) {
		    	return;
		    }
		    else {
		    	System.out.println("invalid commend");
		    }
		    }
		}
	}
}
