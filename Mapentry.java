import java.util.*;
public class Mapentry {
	public static void main(String[] args)throws Exception {
		Map<String,Float> prices=new HashMap<String,Float>();
		prices.put("rice",45.26f);
		prices.put("onion",462.8f);
		prices.put("bringal", 26.88f);
		Set<Map.Entry<String,Float>> product=prices.entrySet();
		for(Map.Entry<String,Float>e:product) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
