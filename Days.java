enum Days{
	MONDAY(55),
	TUESDAY(99),
	WEDNESDAY(77),
	THURSADY(22),
	FRIDAY(1),
	SATURDAY(4),
	SUNDAY(259);
	private int val;
	private Days(int val) {
		this.val=val;
	}
}
class days{
	public static void main(String[] args) {
		for(Days d:Days.values()) {
			System.out.println(d);
		}
	}
}