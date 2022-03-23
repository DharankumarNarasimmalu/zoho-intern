import java.util.*;
import java.util.function.Consumer;
class Con implements Consumer<Integer>{
	public void accept(Integer i) {
		System.out.println(i);
	}
}
public class ConImp {
	public static void main(String...args) {
		List<Integer>l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			l.add(sc.nextInt());
		}
		l.add(1);
		l.add(2);
		l.add(3);
		Consumer<Integer> c=new Con();
		//l.forEach(i->System.out.println(i));
		l.forEach(c);
	}


}
