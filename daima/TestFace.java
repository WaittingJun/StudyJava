interface Singer {
	public static final int i = 1;
	public void sing();
	public void sleep();
}

interface Paint {
	public void paint();
}

class Student implements Singer {
	String name;
	Student(String name) {
		this.name = name;
	}
	public void sing() {
		System.out.println("Student is singing");
	}
	public void sleep() {
		System.out.println("Student is sleeping");
	}
}

class Teacher implements Singer,Paint {
	String name;
	Teacher(String name) {
		this.name = name;
	}
	public String getName() {return name;}
	public void sing() {
		System.out.println("Teacher is singing");
	}
	public void sleep() {
		System.out.println("Teacher is sleeping");
	}
	public void paint() {
		System.out.println("Teacher is painting");
	}
}

public class TestFace {
	public static void main(String[] args) {
		Student s1 = new Student("lili");
		Singer s2 = new Student("limeng");
		Paint t1 = new Teacher("tom");
		s1.sing();s2.sing();
		Singer t2 = (Singer)t1;
		t2.sleep();t1.paint();
		//t1.getName();t1为Paint的变量所以无法访问


	}
}