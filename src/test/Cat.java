package test;
public class Cat extends Mammal {
	
	public Cat(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println("This is Cat " + super.getname() + " speaking!");
	}
	
}
