public class TestCasting {
	public static void main(String[] args) {
		Cat c = new Cat("catname","eyeblue");
		Dog d = new Dog("dogname","furyellow");
		Animal a = new Animal("animalname");
		TestCasting test = new TestCasting();
		test.f(c);test.f(d);
	}
	public void f(Animal anmal) {
		System.out.println(anmal.name);
		if(anmal instanceof Cat) {
			Cat i = (Cat)anmal;
			System.out.println(i.eyeColor);
		}
		 else if(anmal instanceof Dog) {
			Dog j = (Dog)anmal;
			System.out.println(j.furColor);
		}
	}
}

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