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
		System.out.println("Son��sex:"+sex);
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
��������
Father'sex:man-----���๹�췽��ʱ��������丸�๹�췽�������������û�У�ϵͳĬ�ϵ����޲���			���๹�췽����
Son' sex:sman
sman
hello -------ʹ��this���ñ���������Ĺ��췽����
man
*/