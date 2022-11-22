package com.spring;

public class Emp {
	
	private int eno;
	private int salary;
	private String name;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", salary=" + salary + ", name=" + name + "]";
	}
	

}
