package pack3;
import java.util.*;
public class Arrange {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split("[,]");
		List<String>color=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			color.add(arr[i]);
		}
		Collections.sort(color);
		System.out.println(color);
		
	}

}
