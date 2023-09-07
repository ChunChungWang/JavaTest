package JDBCtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "r01b42035";

	public static void main(String args[]) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("要新增的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
//		
//		sc.close();
		
		try {
			////////// 載入電腦////////
			Class.forName(DRIVER);
			System.out.println("載入成功!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
/////step2 建立連線)//////////////
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功!");
// step3 送出SQL指令
			stmt = con.createStatement();
//			int count = stmt.executeUpdate("insert into department  values(50 , '人事部' , '南京復興')");
//			System.out.println(count + "row(s) update.");
			rs = stmt.executeQuery("select * from department order by deptno desc");
//			pstmt = con.prepareStatement("insert into department  values(?,?,?)");
//			
//			pstmt.setInt(1, deptno);// 1 代表第一個?問號
//			pstmt.setString(2, dname);//2 代表第二個?問號
//			pstmt.setString(3, loc);//3 代表第三個?問號
//			pstmt.executeUpdate();
			System.out.println("========================");
			System.out.println(" || " +"deptno" + " || " + " dname " + " || " + "      loc     "+ " || ");
			System.out.println("========================");
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(" ||    " +deptno + "     || " + dname + " || " + loc+ " || ");
				System.out.println("========================");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
