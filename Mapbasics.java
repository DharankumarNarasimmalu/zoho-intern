import java.util.*;
public class Mapbasics {
	public static void main(String [] args ) {
		Map<String,String>phonebook=new HashMap<String,String>();
		phonebook.put("dharan","9876543210");
		phonebook.put("programmer","932156487");
		phonebook.put("scientist","2589631470");
		Set<String> s= phonebook.keySet();
		for(String n:s) {
			System.out.println(n+" "+phonebook.get(n));
		}
		
		
	}
}
