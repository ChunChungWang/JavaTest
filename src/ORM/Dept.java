package ORM;

import java.io.Serializable;

public class Dept implements  Serializable{
private Integer deptno; // 資料庫可能沒輸入而成為空值，空值沒有基本型別，所以用Integer 用類別變數來能使用null
private String dname; 
private String loc;

public Dept() {
	super();
}

public Dept(Integer deptno, String dname, String loc) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.loc = loc;
}

public Integer getDeptno() {
	return deptno;
}

public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

@Override
public String toString() { // Override Object的toString() 方法 使其被print時會直接顯示 下列結果
	return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
} 


}
