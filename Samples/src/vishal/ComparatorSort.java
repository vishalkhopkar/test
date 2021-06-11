package vishal;

import java.util.Arrays;
import java.util.Comparator;

class Employee{
	int age;
	String name;
	int salary;
	public Employee(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}	
	
}
class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// ascending comparison on age
		return e1.age - e2.age;
	}
	
}
class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// descending comparison on salary
		return o2.salary - o1.salary;
	}
	
}
public class ComparatorSort {

	public static void main(String[] args) {
		Employee e1 = new Employee(45, "Sam", 50000);
		Employee e2 = new Employee(36, "Saloni", 80000);
		Employee[] list = new Employee[2];
		list[0] = e1;
		list[1] = e2;
		Arrays.sort(list, new SalaryComparator());
		System.out.println(Arrays.toString(list));
	}

}
