package org.java8;

public class Developer {
	String name;
	int age;
	float salary;
	Developer(String name,int age,float salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public float getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
  public void setSalary(float salary) {
	  this.salary=salary;
  }
	
	

}
