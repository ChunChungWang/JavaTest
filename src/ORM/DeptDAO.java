package ORM;

import java.util.List;

public interface DeptDAO {
	void save(Dept dept);

	void update(Dept dept);

	void delete(Integer deptno);

	Dept findbydeptno(Integer deptno);

	List<Dept> getAll();
}
