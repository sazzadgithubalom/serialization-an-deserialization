package com.alom.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.alom.Address;
import com.alom.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		String fileName = "employee.txt";
		serializeObject(fileName);
		deserializeObject(fileName);
		

	}
	public static void serializeObject(String fileName) {
		Address address = new Address();
		address.setId(420);
		address.setAddressLine1("Sunder House");
		address.setAddressLine2("Sector 122");
		address.setCity("Noida");
		address.setZipCode("201301");
		
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Sazzad");
		emp.setAge(25);
		emp.setEmail("infotcalom@gmail.com");
		emp.setAddress(address);
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(emp);
			}
			System.out.println("Object Serialized.......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserializeObject(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				try {
					Employee emp = (Employee) ois.readObject();
					System.out.println(emp);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
