import java.util.*;
public class Regno {
	public static void main(String[] args) {
		Map<String,String> rmk= new HashMap<String,String>();
		rmk.put("Dharankumar","111719105010");//to insert reading in rmk
		rmk.put("Aadhithya","111719105001");
		rmk.put("Akashraj","111719105003");
		rmk.put("Deepak","111719105009");
		for(Map.Entry k:rmk.entrySet()) {//create for loop by using entries
			System.out.println(k.getKey()+" "+k.getValue());
		}
		System.out.println(rmk);//it print entire reading in array 
		rmk.remove("Dharankumar");//remove the particular data from map
		System.out.println(rmk);
		
	}

}
