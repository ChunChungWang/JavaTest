package test;
public class Dog extends Mammal {
	
	public Dog(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println("This is Dog " + super.getname() + " speaking.");
	}
}
