import java.util.*;
class Season{
enum season{
	SUMMER(8),
	WINTER(5),
	FALL(8),
	RAINY(7);
	private int val;
	private season(int val) {
		this.val=val;
	}
}

	public static void main(String[] args) {
		for(season s1:season.values()) {
			System.out.println(s1);
		}
		System.out.println("value of summer is "+season.valueOf("WINTER").ordinal());
	}
}