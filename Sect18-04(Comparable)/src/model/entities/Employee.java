package model.entities;

public class Employee implements Comparable<Employee> {

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

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}
	/**
	 * Para comparar, utilizamos o atributo do parâmetro recebido, com o 
	 * atributo do próprio objeto.
	 * Podemos inverter a ordenação do método, simplesmente acrescentando o
	 * sinal de menos "-" antes do comparador.
	 * Ex: "return -name.compareTo(o.getName();"
	 */
}
