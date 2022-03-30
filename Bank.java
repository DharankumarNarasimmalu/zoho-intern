package composition2;
import java.io.Console;
import java.util.*;
class User{
	  String username;
	  String accountno;
	  double balance;
	  String phno;
	  static final String Bankname="CENTRAL BANK OF INDIA";
	  User(String[] s)
	{
		username=s[0];
		accountno=s[1];
		balance=Double.parseDouble(s[2]);
		phno=s[3];
		}
}
class Transaction extends User{
	Transaction(String[] s) {
		super(s);
	}
	public void transfer(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		if (balance<=amount) {
			System.out.println("INSUFFICIENT AMOUNT\nBALANCE: "+balance);
		}
		else {
			balance-=amount;
		System.out.println("Your balance amount: "+balance);
		}
	}
	public void transfer(String name) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		if (balance<=amount) {
			System.out.println("INSUFFICIENT AMOUNT\nBALANCE: "+balance);
		}
		else {
			balance-=amount;
		System.out.println("Money "+amount+" transfer to "+name+'\n'+"your account balance=> "+balance);
		}
	}
	public void deposit() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount");
		double amount=sc.nextDouble();
		balance+=amount;
		System.out.println("Your balance amount: "+balance);
	}
	public void balanceEnquiry() {
		System.out.println("Your balance amount: "+balance);
	}
	public void printSlip() {
		System.out.println("Name: "+username+'\n'+"Account number: "+accountno+'\n'+"Phone number: "+phno+'\n'+"Balance: "+balance);
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
		boolean login=true;
		while(validusername || login) {
		Console c=System.console();
		String username=c.readLine("Enter username: ");
	    char[]ch=c.readPassword("enter password: ");
		String password=String.valueOf(ch);
		System.out.println(password);
		
		try {

		if (pass.get(username).equals(password)) {
			login=false;
			
			Bank b=new Bank();
			String userAccount []=new String[4];
			for(String[] s:user) {
				if (s[0].equals(username)) {
					for(int i=0;i<4;i++) {
						userAccount[i]=s[i];
					}
					break;
				}
			}
			User accountdetails=new User(userAccount);
			Transaction act=new Transaction(userAccount);
				System.out.println("Welcome to "+User.Bankname);
				Scanner sc=new Scanner(System.in);
				System.out.println("press 1 to cash withdraw||press 2 to deposit||"
						+ "press 3 to balanceEnquiry||press 4 to print slip||press 5 to money transfer||press 6 to exit");
				
				while(true) {
				int actionNo=sc.nextInt();
				switch(actionNo) {
				case(1):
					act.transfer();
				    break;
				case(2):
					act.deposit();
				    break;
				case(3):
					act.balanceEnquiry();
				    break;
				case(4):
					act.printSlip();
				    break;
				case(6):
					System.out.println("Exit");
				    return;
				case(5):
					System.out.println("Enter receiver name");
					act.transfer(sc.next());
					break;
				default:
					System.out.println("Invalid commend");
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
		}
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
