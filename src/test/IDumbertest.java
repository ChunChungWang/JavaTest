package test;

import java.util.Scanner;

public class IDumbertest {
public  static void main(String[] agrs) {
	Scanner sc = new Scanner(System.in);
	String mode = "^[A-Za-z][12][0-9]{4}-[0-9]{4}$";
	System.out.println("請輸入身份證字號");
	String x = sc.next();

	sc.close();

	if(x.matches(mode)) {
		System.out.println("輸入成功");
	}else {
		System.out.println("輸入失敗");
		}
}
}
