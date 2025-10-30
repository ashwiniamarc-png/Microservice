package hashmap;

import java.util.Objects;

public class Emp {

	int id;
	String name;
	String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Emp() {
		
		
	}
	public Emp(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, id, name);
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name);
//	}
	
	
	
	
	
	
}
