package ORM;

import java.util.List;
import java.util.Scanner;

public class DeptTest {
public static void  main(String args[]) {
	
//	Scanner sc = new Scanner(System.in);
	
//	System.out.println("要新增的編號");
//	System.out.println("要查詢的編號");
//
//	int deptno = sc.nextInt();
//	System.out.println("要新增的名稱");
//	String dname = sc.next();
//	System.out.println("要新增的所在地");
//	String loc = sc.next();
	
//	sc.close();
	//用 Dept Bean包容新增的資料
//	Dept dept =new Dept(deptno,dname,loc);
//	//透過dept物件呼叫方法完成新增部門資料
	DeptDAO dao = new DeptDAOImpl(); 
//	dao.save(dept);
//	System.out.println("新增成功!");
//	Dept dept = dao.findbydeptno(deptno);
//	System.out.println(dept.toString());
	List<Dept> deptlist = dao.getAll();
	for(int i=0;i<deptlist.size();i++) {
		System.out.println(deptlist.get(i));// 把物件交給print 他會直接交給toString方法
	}
	
}
}
