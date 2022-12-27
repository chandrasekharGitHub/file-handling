/*
 * 
 * Serialization in Java is a mechanism of writing the state of an object 
  into a byte stream.

It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.

The reverse operation of serialization is called deserialization.

Advantages of Java Serialization

It is mainly used to travel object's state on the network (which is known as 
marshaling).

java.io.Serializable interface

Serializable is a marker interface (has no data member and method). It is used 
to "mark" Java classes so that objects of these classes may get the certain 
capability. 

The Cloneable and Remote are also marker interfaces.

It must be implemented by the class whose object you want to persist.

The String class and all the wrapper classes implement the 
java.io.Serializable interface by default.


 * 
 * 
 */
package com.files.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Files010 {
	public static void main(String[] args) {
		
		Student s1 = new Student(211,"Ravi");  
		
		//java.io.Serializable
		
		try {
		  FileOutputStream fout=new FileOutputStream("students.txt");  
		  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  
		  out.flush(); 
		  
		  System.out.println("success");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
