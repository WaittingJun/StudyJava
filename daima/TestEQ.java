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
������ʾ �Ҳ�������
		public boolean equals(object obj) {
				      ^
	���ţ���object
	λ�ã� ��A
ԭ��objectӦ��ΪObject
������ʾ �Ҳ�������
		return ture; 
	���ţ�����ture
	λ�ã���A
ԭ��tureӦ��true
������ʾ �Ҳ�������
		if(this.i == obj.i&&this.j == obj.j) {
	���ţ����� i
	λ�ã�����ΪObject�ı��� obj
ԭ�򣺱���i ������Object;������ǿ��ת����A��

public class TestEQ {
	public static void main(String[] args) {
		A a = new A(1,2);
		A b = new A(1,3);
		boolean c = a.equals(b);
		System.out.println(c);
	}
}*/

// ��ȷ����  �ж� a == b?
class A {
	int i;
	int j;
	A(int i , int j) {
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj) {
		if(obj instanceof A){
			A d = (A)obj; //������Ҫ������
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
