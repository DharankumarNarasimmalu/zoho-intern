package ottplatform;
import java.util.*;
class Ceo{
	String name;
	String ceo;
	public Ceo(String name,String ceo) {
		this.name=name;
		this.ceo=ceo;
	}
	
	
}
public class Composition {
	public static void main(String...args) {
	List<Ceo>main=new ArrayList<>();
	main.add(new Ceo("ZOHO","Sridhar Vembu"));
	main.add(new Ceo("AMAZON","Andy Jassy"));
	
	
	}

}
