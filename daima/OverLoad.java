class Person {
	int id;
	int age=20;
//��������
	void info() {
		System.out.println("My id is "+id);
	}

//��������
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