package Homework_extra;

public abstract class Pen {
	private String brand;
	private Double price;
	
public	Pen(){}
public	Pen(String brand,Double price){
	this.brand=brand;
	this.price =price;
}

public void Setter(String brand) {
	this.brand=brand;
}
public void Setter(Double price) {
	this.price =price;
}

public void Setter(String brand,Double price) {
	this.brand=brand;
	this.price =price;
}
public void Setter(Double price,String brand) {
	this.price =price;
	this.brand=brand;
}


public String Getterbrand() {
	return this.brand;
}
public Double Getterprice() {
	return  this.price;
}

public abstract void write();

}
