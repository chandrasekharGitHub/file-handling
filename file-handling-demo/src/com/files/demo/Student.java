package com.files.demo;

import java.io.Serializable;
// Serializable interface is a MOCK interface (interface does have any method).
public class Student implements Serializable {

	private static final long serialVersionUID = -5928775547519593886L;
	
	private int id;  
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
