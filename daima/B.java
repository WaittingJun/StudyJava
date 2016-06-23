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
//ͻȻ֪�����������ֱ�ӵ��÷�������ǰδע�⡣�˴β��Է������췽����һ�㷽��������