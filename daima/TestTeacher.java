class Person {
	private String name;
	private String location;
	Person(String name ,String location) {
		this.name = name;
		this.location = location;
	 	
	}
	String info(){
			return "name:"+name+'\n'+"location:"+location;
		}
}

class Student extends Person {
	String school; 
	Student(String n ,String l,String school) {
		super(n,l);
		this.school = school;
	}
	 String info(){
		return super.info()+'\n'+"school:"+school;
	}
}

class Teacher extends Person {
	String captial;
	Teacher(String n,String c) {
		this(n , "shanghai",c);
	} 
	Teacher(String n ,String l,String c) {
		super(n,l);
		this.captial = c;
	}
	String info() {
		return super.info()+'\n'+"captial"+captial;
	}
}
public class TestTeacher {
	public static void main(String[] args) {
		Student s = new Student("xiaoming","beijing","lishanschool");
		Teacher c = new Teacher("lilei","profess");
		System.out.println(s.info());
		System.out.println(c.info());
	}
}