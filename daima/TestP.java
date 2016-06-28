public class TestP {
	public static void main(String[] args) {
		Cat c = new Cat("catname","eyeblue");
		Dog d = new Dog("dogname","furyellow");
		//Animal a = new Animal("animalname");
		Pet p = new Pet("pet",c);
		p.myf();
		//TestCasting test = new TestCasting();
		//test.f(c);test.f(d);test.f(p);
	}
	/*public void f(Animal anmal) {
		System.out.println(anmal.name);
		if(anmal instanceof Cat) {
			Cat i = (Cat)anmal;
			System.out.println(i.eyeColor);
		}
		 if(anmal instanceof Dog) {
			Dog j = (Dog)anmal;
			System.out.println(j.furColor);
		}
		 else {System.out.println("it doesn't dog and cat");}
	}*/
}

/*class Animal {
	public String name;
	Animal(String name) {
		this.name = name;
	}
	public void f() {
		System.out.println("sound");//此处无法打印，没有用，可以用抽象方法
	}//把父类此方法删了出现错误：找不到符号   public void myf(){pig.f()}  
}*/

abstract class Animal {
	public String name;
	Animal(String name) {
		this.name = name;
	}
	public abstract void f();
}
class Dog extends Animal {
	String furColor;
	Dog(String n , String furColor) {
		super(n);
		this.furColor = furColor;
	} 

	public void f() {
		System.out.println("Dog sound");
	}
}

class Cat extends Animal {
	String eyeColor;
	Cat(String n, String eyeColor) {
	super(n);
	this.eyeColor = eyeColor;	
	}
	public void f() {
		System.out.println("cat sound");
	}
}
class Pet {
	String name;
	Animal pig;
	Pet(String name , Animal pig) {
		this.name = name;
		this.pig = pig;
	}
	public void myf(){pig.f();}//这个是多态的关键，需要new个对象，再传递
}
//途中出现的错误：解析时已到达文件结尾----大括号少了只耳朵


