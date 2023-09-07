package Homework_extra;

public class Pencil extends Pen{


public void write() {
System.out.print("削鉛筆再寫");
}

public Double Getterprice() {
	return  super.Getterprice()*0.8;
}
}
