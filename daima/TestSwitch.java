public class TestWitch {
	public static void main (String args[]){
		for (int i=0;i<6;i++) {
			switch (i) {
				case 1 :
				System.out.println("A");
				break;
				case 2 :
				System.out.println("b");
				break;
				case 3 :
				case 5 :
				System.out.println("c");
				break;
				default:
				System.out.println("no");
			}	
		}
	}
}