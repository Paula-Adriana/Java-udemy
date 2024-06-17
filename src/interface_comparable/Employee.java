package interface_comparable;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// Para usar o método compareTo precisa implementar a interface
	// método que comparar o seu objeto com algum outro obj que virá no parametro
	// retorna um inteiro:
	//  0: =
	// -1: <
	//  1: >
	@Override
	public int compareTo(Employee other) {
		// o compareTo abaixo é da String
		return salary.compareTo(other.getSalary());
	}
}
