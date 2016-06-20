//输出101~200内的质数
public class Test {
	public static void main(String[] args) {
		
		for(int i=101;i<200;i+=2) {
				
			for(int f=2;f<i;f++){
			if(i%f==0)
			{continue;}
			
			}
			System.out.print(" "+i);
		}
	}
}