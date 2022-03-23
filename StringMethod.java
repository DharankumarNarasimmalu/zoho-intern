import java.util.Scanner;
public class StringMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String S1=S.concat(S);//merge two string;
		String S2=S.substring(2,4);//slice the string
		boolean S3=S2.equals(S);//check wheather the twostring is eyal
		String S4=S.replace("j","v");//replace two letter
		int a=S.length();//find length of string
		char[] arr=S.toCharArray();//string to char array
		String[] arr2=S.split("[AEIOU]");//split the string 
		System.out.println(S+'\n'+S1+'\n'+S2+'\n'+S2+'\n'+S4+'\n'+a+'\n'+arr+'\n'+arr2);
	}

}
