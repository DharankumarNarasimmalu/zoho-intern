import java.util.*;
public class Put_if_absent {
	public static void main(String[] args) {
		Map<String,Integer> students= new HashMap<>();
		students.put("Aadhi",5001);
		students.put("Akash",5003);
		students.put("Deepak",5009);
		students.put("dharan",5010);
		students.putIfAbsent("Kiran",5032);
		Map<String,Integer> rmk=new HashMap<>();
		rmk.put("hari",5021);
		rmk.putAll(students);
		for(Map.Entry clg:rmk.entrySet()) {
			System.out.println(clg.getKey()+":"+clg.getValue());
		}
	}

}
