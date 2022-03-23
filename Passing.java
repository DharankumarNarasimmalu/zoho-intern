class Obj{
	int a;
	int b;
	Obj(int a,int b){
		this.a=a;
		this.b=b;
	}
	void add(Obj a){
		System.out.println(a.a+a.b);
	}
}
public class Passing {
	public static void main(String [] args) {
		Obj O=new Obj(5,6);
		Obj O1=new Obj(11,85);
		O.add(O);
	}

}
