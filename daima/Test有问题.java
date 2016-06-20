public class Test {
	public static void main (String[] args){
		Test test = new Test();
		int date = 9;
		BirthDate d1 = new BirthDate();
		//BirthDate d2 = new BirthDate(1,1,2000); 
		d1.BirthDate();
	}
	void m() {
	System.out.println("hell");
	}
}
class BirthDate {
	private int day;
	private int month;
	private int year;
	public BirthDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	public BirthDate() {
		day = 1;
		month = 2;
		year = 3;
		System.out.println(day+month+year);
	}	
}