public class TestOverWrite {
	public static void main(String[] args) {
		Stu student = new Stu();
		
		student.setName("xiaoming");
		student.setAge(18);
		student.setSchool("TestSchool");
		student.getInfo();
	}
}

class Stu extends Person {
	String school;
	String getSchool() {
		return school;
	}

	void setSchool(String school) {
		this.school = school;
	}
	void getInfo() {
		System.out.println("name:"+name+'\n'+"age:"+age+'\n'+"school:"+school);
	}
}

class Person {
	public String name;
		int age;
	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	String setName(String name) {
		return this.name = name;
	}

	String getName() {
		return name;
	}

	void getInfo() {
		System.out.println("name:"+name+'\n'+"age:"+age);
	}
}