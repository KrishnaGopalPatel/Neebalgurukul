package com.gurukul.day4;

class Employee {
    private String name;
	private String employeeId;
	private String salary;
	private String depertment;
	
	public Employee(String name, String employeeId, String salary, String depertment) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.depertment = depertment;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + ", depertment="
				+ depertment + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepertment() {
		return depertment;
	}

	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}

}
