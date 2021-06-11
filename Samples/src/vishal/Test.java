package vishal;

import java.util.HashSet;
import java.util.Set;

class Student{
	int id;
	String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}

public class Test {

	
	public static void main(String[] args) {
		Student e1 = new Student(1, "Vishal");
		Student e2 = new Student(1, "Saloni");
		System.out.println(e1.equals(e2));

		Student e3 = new Student(4, "Shekhar");
		Set<Student> set = new HashSet<Student>();
		set.add(e1);
		set.add(e3);
		
		
		set.remove(e2);
		System.out.println(set);
	}

}
