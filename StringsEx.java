
import java.util.Scanner;
public class StringsEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String S1=S.concat(sc.nextLine());
		boolean S2=S.equals(sc.nextLine());
		int l=S.length();
		char C=S.charAt(sc.nextInt());
		int k=S.indexOf(sc.next());
		System.out.println(S);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(C);
		System.out.println(k);
		
	}

}
