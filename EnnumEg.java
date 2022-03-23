import java.util.Scanner;
enum Cards{
	HART(55),DIAMOND(77),SPADES(99),CLUBS(23);
	public int val;
	private Cards(int val) {
		this.val=val;
	}
}
public class EnnumEg {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Cards C=Cards.valueOf(s);
		switch(C){
		case HART:
			System.out.println(C.val+" "+"good Luck");
			break;
		case DIAMOND:
			System.out.println(C.val+" "+"will become rich preson");
			break;
		case SPADES:
			System.out.println(C.val+" "+"Darkness will surround U");
			break;
		case CLUBS:
			System.out.println(C.val+" "+"badluck");
			break;
		default:
			System.out.println("go to hell");
			
		}
	}

}
