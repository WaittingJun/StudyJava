//�ݹ� �� 1��1��2��3��5��8����������40������ֵ ��������ݹ鹫ʽ F1=1,F2=1,Fn=F(n-1)+F(n-2)
public class T {
	public static void main (String[] args){
		
		System.out.println(method(7));
	}
	public static int method (int n) {
		if (n==1||n==2) {
			return 1;
		} else {
			return method (n-1) + method (n-2);
		}
	}
}