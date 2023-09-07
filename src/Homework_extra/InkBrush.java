package Homework_extra;

public class InkBrush extends Pen{

	public void write() {
		System.out.print("沾墨汁再寫");
		}
	public Double Getterprice() {
		return  super.Getterprice()*0.9;
	}
}
