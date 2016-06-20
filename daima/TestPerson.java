public class TestPerson {
	public static void main(String[] args) {
		Stu stu = new Stu();
		//System.out.println(stu.i); 
		System.out.println(stu.j);
		System.out.println(stu.k);
		System.out.println(stu.l);
		//System.out.println(stu.i);
	}
}

class Stu extends Person {
	//i = 10;
	//j = 20;
	//k = 30;
	//l = 40;
}

class Person {
	private int i = 1;
		int j = 2;
	protected int k = 3;
	public int l = 4;
}