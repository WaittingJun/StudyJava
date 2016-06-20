//package m;为什么这样不行
class Father {
	public String sex;
	public void Father() {
		sex = "man";
		System.out.println("Father'sex:"+sex);
	}
}

class Son extends Father {
	public String sex;
		
		public void Father() {
			super.Father();
			sex = "sman";
			System.out.println("Son’sex:"+sex);
			System.out.println(sex);
			System.out.println(this.sex);
			System.out.println(super.sex);

		}
}

public class TestSuper {
	public static void main(String[] args) {
		Son s = new Son();
		s.Father();
	}
}