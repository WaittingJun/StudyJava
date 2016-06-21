class Father {
	public String sex;
	Father() {
		sex = "man";
		System.out.println("Father'sex:"+sex);
	}
}

class Son extends Father {
	public String sex;
	Son() {
		
		sex = "sman";
		System.out.println("Son’sex:"+sex);
		System.out.println(sex);
		this.soon();
		System.out.println(super.sex);
	}
	void soon() {
		System.out.println("hello");	
	}
}

public class TestSuperSub {
	public static void main(String[] args) {
		Son s = new Son();
		
	}
}
/*
输出结果：
Father'sex:man-----子类构造方法时必须调用其父类构造方法，如果子类中没有，系统默认调用无参数			父类构造方法。
Son' sex:sman
sman
hello -------使用this调用本类中另外的构造方法。
man
*/