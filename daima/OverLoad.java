class Person {
	int id;
	int age=20;
//方法重载
	void info() {
		System.out.println("My id is "+id);
	}

//方法重载
	void info(int a) {
		age = a;
		System.out.println(age);
	}
}

public class OverLoad{
	public static void main(String[] args) {
		Person p = new Person();
		p.info();
		p.info(30);
	}
}