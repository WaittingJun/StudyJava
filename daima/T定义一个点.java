//定义一个点
class Point{
	int x;
	int y;
	int z;
	Point(int a, int b, int c){
		x=a;
		y=b;
		z=c;
	}

	void setX(int a) {
		x = a;
	}
	void setY(int b) {
		y = b;
	}

	void setZ(int c) {
		z = c;
	}

	int getDistence(int i) {
		return (x-i)*(x-i)+y*y+z*z;
	}
}

public class T {
	public static void main(String[] args) {
		Point p = new Point(2,1,1);
		System.out.println(p.getDistence(2));
		p.setX(2);
		System.out.println(p.x);
	}
}	