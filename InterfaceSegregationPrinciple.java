package solid;
import java.util.*;
interface Area{
	void calculateArea(int l,int h);
}
interface Volume{
	void calculateVolume(int l,int b,int h);
}
class Cube implements Area,Volume{
	 public void calculateArea(int l,int h) {
		System.out.println(l*h);
	}
	public void calculateVolume(int l,int b,int h) {
		System.out.println(l*h*b);
	}
}
class Square implements Area{
	public void calculateArea(int l,int h) {
		System.out.println(l*h);
	}

}
class Cuboid implements Area,Volume{
	public void calculateArea(int l,int h) {
		System.out.println(l*h);
	}
	public void calculateVolume(int l,int b,int h) {
		System.out.println(l*h*b);
	}
}
class rectangle implements Area{
	public void calculateArea(int l,int h) {
		System.out.println(l*h);
	}

}

public class InterfaceSegregationPrinciple {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		int breath=sc.nextInt();
		int length=sc.nextInt();
		Area area;
		Volume vol;
		String shape=sc.next();
		switch(shape) {
		case("cube"):
			area=new Cube();
		    vol=new Cube();
		    area.calculateArea(length,height);
		    vol.calculateVolume(length,height,breath);
		    break;
		case("square"):
			area=new Square();
		    area.calculateArea(length,height);
		    
		    break;
		case("cuboid"):
			area=new Cuboid();
		    vol=new Cuboid();
		    area.calculateArea(length,height);
		    vol.calculateVolume(length,height,breath);
		    break;
		case("rectangle"):
			area=new Cube();
		    area.calculateArea(length,height);
		    break;
		   
			
		}
		
		
	}

}
