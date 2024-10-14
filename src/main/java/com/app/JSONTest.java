package com.app;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Employee e1 = new Employee(100,"shantanu");
        
        String jsonData = mapper.writeValueAsString(e1);
        System.out.println(jsonData);
        

    }
}


class Employee {
	private int empId;
	private String name;
	
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}