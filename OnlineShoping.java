package solid;
import java.util.*;
class OrderedProduct{
	String productName;
	float billamount;
	Payment pay;
	Discount dis;
	public OrderedProduct(String[] product,Payment pay,Discount dis) {
		this.productName=product[0];
		this.billamount=Float.parseFloat(product[1]);
		this.pay=pay;
		this.dis=dis;
	}
	void cart() {
		System.out.println(productName+" "+billamount);
		
	}
	void billpayment() {
		float amount=pay.paymentgatway(billamount);
		float billamountAfterDiscount=dis.discount(amount);
		System.out.println("PRODUCT NAME  AMOUNT  DISCOUNTAMOUNT   TOTALAMOUNT");
		System.out.println(productName+"  "+billamount+"  "+(billamount-billamountAfterDiscount)+"            "+billamountAfterDiscount);
	}
}
interface Payment{
	float paymentgatway(float amount);
}
class Upi implements Payment{
	public float paymentgatway(float amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter UPI code");
		int code=sc.nextInt();
		float chargeamount=amount*0.01f;
		System.out.println("transfercharge"+amount*0.01);
		return amount+chargeamount;
		
	}
}
class CardPay implements Payment{
	public float paymentgatway(float amount) {
		float netamount;
		if (amount>500) {
			netamount=amount+amount*0.05f;
		}
		else {
			netamount=amount;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter card number");
		long cardno=sc.nextLong();
		System.out.println("Enter cv number");
		int cvno=sc.nextInt();
		System.out.println("amount payed successfully");
		return netamount;
		
	}
}
class NetBanking implements Payment{
	public float paymentgatway(float amount) {
		float netamount;
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		long password=sc.nextLong();
		if (amount>1000) {
			netamount=amount*0.03f;
		}
		else {
			netamount=amount;
		}
		return netamount;
		
	}
}
interface Discount{
	float discount(float amount);
}
class PongalDis implements Discount{
	public float discount(float amount) {
		return amount-1500;	
	}
}
class DiwaliDis implements Discount{

	public float discount(float amount) {

		return amount-2000;
	}
}
class RegularDis implements Discount{
	public float discount(float amount) {
		return amount-500;
	}
}	

public class OnlineShoping {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		List<String[]>product=new ArrayList<>();
		String product1[]= {"Redme phone","15000","pongaldiscount"};
		String product2[]= {"Iwatch","30000","pongaldiscount"};
		String product3[]= {"Tablet","25,000","regulardiscount"};
		product.add(product1);
		product.add(product2);
		product.add(product3);
		String currProduct[]=new String[3];
		boolean check=true;
		while(check) {
		System.out.println("Enter porduct name");
		String productName=sc.nextLine();

		for(String[] s:product) {
			if (productName.equals(s[0])) {
				for(int i=0;i<3;i++) {
					currProduct[i]=s[i];
				}
				check=false;
			}
		}
		if(check) {
			System.out.println("product is not available");}
		}
		Payment pay = null;
		System.out.println("Press 1 for UPI|| press 2 for card payment||press 3 for net banking");
		int commend=sc.nextInt();
		switch(commend) {
		case(1):
			pay=new Upi();
		    break;
		
		case(2):
			pay=new CardPay();
		    break;
		case(3):
			pay=new NetBanking();
		}
		Discount discount=null;
		switch(currProduct[2]) {
		case("pongaldiscount"):
			discount=new PongalDis();
		break;
		
		case("regulardiscount"):
			discount=new RegularDis();
			break;
		}
		OrderedProduct op=new OrderedProduct(currProduct,pay,discount);
		op.cart();
		op.billpayment();
	}
}
