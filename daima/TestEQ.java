/*class A {
	int i;
	int j;
	A(int i , int j) {
		this.i = i;
		this.j = j;
	}
	public boolean equals(object obj) {
		if(obj instanceof A){
			
			if(this.i == obj.i&&this.j == obj.j) {
				return ture;
			}
		}
		return false;
	}
}
错误提示 找不到符号
		public boolean equals(object obj) {
				      ^
	符号：类object
	位置： 类A
原因：object应该为Object
错误提示 找不到符号
		return ture; 
	符号：变量ture
	位置：类A
原因：ture应该true
错误提示 找不到符号
		if(this.i == obj.i&&this.j == obj.j) {
	符号：变量 i
	位置：类型为Object的变量 obj
原因：变量i 不属于Object;所以先强制转化成A类

public class TestEQ {
	public static void main(String[] args) {
		A a = new A(1,2);
		A b = new A(1,3);
		boolean c = a.equals(b);
		System.out.println(c);
	}
}*/

// 正确代码  判断 a == b?
class A {
	int i;
	int j;
	A(int i , int j) {
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj) {
		if(obj instanceof A){
			A d = (A)obj; //这点很重要！！！
			if(this.i == d.i&&this.j == d.j) {
				return true;
			}
		}
		return false;
	}
}


public class TestEQ {
	public static void main(String[] args) {
		A a = new A(1,2);
		A b = new A(1,3);
		boolean c = a.equals(b);
		System.out.println(c);
	}
}
