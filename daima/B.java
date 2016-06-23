class A {
	public void print(String s) {
		System.out.println(s);
	}

	A(){print("A:");}
	A(String s){print(s);}
	public void f() {
		print("A:f");
	}
}

public class B extends A {
	B(){
		super("super.a");
		print("B:");
	}
	
	B(String s){
		super("super.b");
		print(s);
	}
	public void f() {
		print("B:f");
	}
	public static void main(String[] args) {
		B b = new B();
		B c = new B("small");
		b.f();
	}
}
//突然知道方法里可以直接调用方法，以前未注意。此次测试分析构造方法和一般方法的区别