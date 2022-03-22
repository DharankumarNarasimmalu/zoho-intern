public class Stringexp {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello ");
		sb.append("world ");
		sb.append("Iam ");
		sb.append("Dharan ");
		sb.replace(5,9,"hell ");//replace the element from string
		sb.insert(2,"kumar");//insert new element in respective index
		sb.delete(4,9);//delete the element from index 4 to 9
	    System.out.println(sb);
	}
}
/*the string is immutable  that means it will never change the value it only change the address
 * but in string builder the value must be change in same address*/
