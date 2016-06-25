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
		//System.out.println(cat instanceof Dog);���󣺲����ݵ����ͣ�Cat�޷�ת��ΪDog

		 animal = new Dog("SmallBlack","black");
		//cat = new Dog("SmallBlack","black");����Dog�޷�ת��ΪCat
		System.out.println(animal.name);
		/*System.out.println(animal.furColor);�����Ҳ�������System.out.println(animal.furColor);
											       ^
			���ţ�����furColor
			λ�ã�����ΪAnimal�ı��� animal	*/
		Dog d = (Dog)animal;//ǿ��ת��
		System.out.println(d.furColor);
		//Dog d1 = (Dog)cat;����Cat�޷�ת��ΪDog
	}								
}
/*�ܽ᣺1���������ǿ��ת�������ࣻ2������ͨ��������ı��� instanceof ���������ж϶���ı����Ƿ����ڸ���������� ��instanceof������ ���Է���ɡ�����xx�ࡱ��*/	