package solid;
import java.util.*;
class Powerplant{
	Boiler b;
	Turbine t;
	Generator g;
	Load l;
	public Powerplant(Boiler b, Turbine t, Generator g,Load l) {
		this.b=b;
		this.t=t;
		this.g=g;	
		this.l=l;
	}
	void blocks() {
		System.out.println("BOILER");
		b.properties();
		System.out.println("TURBINE");
		t.turbinefunc();
		System.out.println("GENERATOR");
		g.generator();
		System.out.println("LOAD");
		l.load();
	}
	

	
}
interface Boiler{
	 void properties();
}
class Locomotive implements Boiler{
	public void properties() {
		System.out.println("It is portable.\r\n"
				+ "This boiler is capable of meeting sudden and fluctuating demands of steam.\r\n"
				+ "It is a cost-effective boiler.\r\n"
				+ "High steam generation rate.\r\n"
				+ "It is compact in size and its operation is easy");
	}
}
class Lancashire implements Boiler{
	public void properties() {
		System.out.println("Lancashire boiler works on the principle of the heat exchanger. "
				+ "The heat is a transfer from exhaust gases to the water through convection. "
				+ "It is a natural circulation boiler that uses natural current to flow the water inside the boiler.")
	}
}
class Turbine{
	void turbinefunc() {
		System.out.println("Briefly, the purpose of a turbine is to convert"
				+ " the available energy into the fluid that enters it to generate electrical energy. "
				+ "In its conception, the turbine expands "
				+ "the fluid that enters it, decreasing its pressure – or even, decreasing its internal energy");
	}
}
class Generator{
	void generator() {
		System.out.println("Most power stations contain one or more generators, a rotating machine that converts mechanical power "
				+ "into three-phase electric power. The relative motion between a magnetic "
				+ "field and a conductor creates an electric current.");
	}
}
class Load{
	void load() {
		System.out.println("A load-following power plant, regarded as producing mid-merit "
				+ "or mid-priced electricity, is a power plant that adjusts its power output as demand "
				+ "for electricity fluctuates throughout the day");
	}
}
public class DependencyInversionPrinciple {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		Boiler b =new  Locomotive();
		Turbine t=new Turbine();
		Generator g=new Generator();
		Load l=new Load();
		Powerplant powerplant=new Powerplant(b,t,g,l);
		powerplant.blocks();
		
		
		
	}

}
