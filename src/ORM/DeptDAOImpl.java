package ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;  // 自己創的util類別(工具)

public class DeptDAOImpl implements DeptDAO { //作為此資料庫載入的模板

	public static final String INSTER_STMT = "insert into department value (?,?,?)"; //對該資料庫的操作 新增資料
	public static final String FIND_BY_DEPTNO = "select * from department where deptno =  ? "; //(?,?,?)"; //對該資料庫的操作 查詢單體
	public static final String GET_ALL = "select * from department order by deptno"; //對該資料庫的操作 查詢所有
	// 當此類別被JVM載入時，驅動也就跟者載入環境裡面
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	@Override
	public void save(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
	try {
		con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
		pstmt = con.prepareStatement(INSTER_STMT);
//		System.out.println("連線成功!");
		pstmt.setInt(1, dept.getDeptno());
		pstmt.setString(2,dept.getDname());
		pstmt.setString(3,dept.getLoc());
		pstmt.executeUpdate();
		
	}catch(SQLException e) {
		e.printStackTrace();}finally {Util.closedResource(con,pstmt,null);}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findbydeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		Dept dept  = null;
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO) ;
			pstmt.setInt(1, deptno);
//			System.out.println("連線成功!");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				 dept = new Dept(deptno,dname,loc);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();}finally {Util.closedResource(con,pstmt,rs);}
		
		return dept;

		
	}

	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		List<Dept>  deptlist= new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL) ;			
//			System.out.println("連線成功!");
			rs = pstmt.executeQuery();
			while(rs.next()) {
			
				Integer deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc"); 
				Dept dept= new Dept(deptno,dname,loc);
				deptlist.add(dept);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();}finally {Util.closedResource(con,pstmt,rs);}
		
		return deptlist;	}

}
