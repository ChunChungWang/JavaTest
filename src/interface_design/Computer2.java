package interface_design;

public class Computer2 {
	private USB usb;
	                // 參數多型化 (只要實作的物件都能傳入)
	public void setUSB(USB usb) {   ///所有的周邊都為USB的子類別，所以可以從父類別的USB來統一(標準化)指令
		this.usb = usb;
	}
	
	public void workWithUSB() {
		usb.work();
	}
	
}
