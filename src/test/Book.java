package test;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class Book implements Serializable {  //Serializable  為空介面 用途為貼標籤
		private static final long serialVersionUID = 8315449942815314809L;
		private String name;
		private double price; // 如果加上transient，該屬性不會加入序列化
		private String author;

		public Book(String name, double price, String author) {
			this.name = name;
			this.price = price;
			this.author = author;
		}

		public void show() {
			System.out.println("書名: " + name);
			System.out.println("定價: " + price);
			System.out.println("作者: " + author);
		}
	
		public static void main(String[] args) throws Exception {
			File file = new File("C:\\THA103_Workspace\\JavaEx-2\\bookInfo.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Book) ois.readObject()).show();
				// ois.readObject() 為一個名為ois資料流的readObject() 方法
//					// 可以return一個object的物件
//					// 拿到是object物件 需要轉型成為book 才能用book的show方法
				System.out.println("--------------------");
							}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();			
			
			
			
		}
}
