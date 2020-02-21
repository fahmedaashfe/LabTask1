package employee;
public class Employee {
	private String id, name;
	private double salary;
	public Employee() {

	}
	public Employee(String id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("18-36767-1", "FAHMEDA HOQUE", 45000);
		System.out.print(e1);
	}
	
}

