//���1~100��ǰ5�����Ա�3������
public class Test {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0){
				System.out.print(" "+i);
				
				num++;
				
			}
			if(num==5) {break;}	
		}
	}
}

/*public class Test {
	public static void main(String[] args) {
		//���԰�int num=0;���ڴ˴�
		for(int i=1;i<=100;i++) {
			if(i%3==0){
				System.out.print(" "+i);
				int num=0;/*���ڴ˴���ÿ��ѭ������num��ֵ��0*/
				num++;
				if(num==5) {break;}	
			}
			
		}
	}
}*/