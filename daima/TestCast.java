class Animal {
	public String name;
	Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	String furColor;
	Dog(String n , String furColor) {
		super(n);
		this.furColor = furColor;
	} 
}

class Cat extends Animal {
	String eyeColor;
	Cat(String n, String eyeColor) {
	super(n);
	this.eyeColor = eyeColor;	
	}
}

public class TestCast {
	public static void main(String[] args) {
		Animal animal = new Animal("animal");
		Cat cat = new Cat("mimi","blue");
		Dog dog = new Dog("BigYellow","yellow");
		System.out.println(cat instanceof Animal);//true
		System.out.println(cat instanceof Cat);//true
		System.out.println(animal instanceof Cat);//false
		//System.out.println(cat instanceof Dog);错误：不兼容的类型：Cat无法转换为Dog

		 animal = new Dog("SmallBlack","black");
		//cat = new Dog("SmallBlack","black");错误：Dog无法转换为Cat
		System.out.println(animal.name);
		/*System.out.println(animal.furColor);错误：找不到符号System.out.println(animal.furColor);
											       ^
			符号：变量furColor
			位置：类型为Animal的变量 animal	*/
		Dog d = (Dog)animal;//强制转换
		System.out.println(d.furColor);
		//Dog d1 = (Dog)cat;错误：Cat无法转换为Dog
	}								
}
/*总结：1、父类可以强制转换成子类；2、可以通过（对象的变量 instanceof 类名）来判断对象的变量是否属于该类或者子类 （instanceof操作符 可以翻译成“属于xx类”）*/	