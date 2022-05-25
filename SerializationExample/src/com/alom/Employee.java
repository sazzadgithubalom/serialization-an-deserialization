package com.alom;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7937849094564025868L;
	private int id;
	private String name;
	private int age;
	private  String email;
	private Address address;
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}
	public Employee(int id, String name, int age, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	public Employee() {
		super();

	}
	
	

}
