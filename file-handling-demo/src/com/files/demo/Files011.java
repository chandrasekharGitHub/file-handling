/*
 * 
 * Deserialization in java
Deserialization is the process of reconstructing the object from the serialized state.It is the reverse operation of serialization.

ObjectInputStream class

An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.

 */
package com.files.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class Files011{
	public static void main(String[] args) {
		//Student s1 =new Student(211,"ravi");  
		  
		try {
			FileInputStream fin = new FileInputStream("students.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			
			Student s=(Student)in.readObject();  
			
			System.out.println(s);  
			  
			in.close();  
		  
			System.out.println("success");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
