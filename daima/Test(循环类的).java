//输出1~100内前5个可以被3整除的
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
		//可以把int num=0;放在此处
		for(int i=1;i<=100;i++) {
			if(i%3==0){
				System.out.print(" "+i);
				int num=0;/*放在此处，每次循环都把num赋值成0*/
				num++;
				if(num==5) {break;}	
			}
			
		}
	}
}*/