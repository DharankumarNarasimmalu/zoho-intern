import java.util.*;
public class Mapping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println();
		Map<Integer,String> entry=new HashMap<>();
		for(int i=0;i<=N;i++) {
			entry.put(i,(sc.nextLine()));
		}
		for(Map.Entry e:entry.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}