package com.concept.hashCodeEqual;

import java.util.Objects;

public class Employee {
	
	int id ;

	public Employee(int id) {
		super();
		this.id = id;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id;
//	}
	
	

}
