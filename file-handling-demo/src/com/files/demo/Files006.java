/*
 * 
 * 	Java BufferedOutputStream Class
 * 
 * 	Java BufferedOutputStream class is used for buffering an output stream. 
 * 
 * It internally uses buffer to store data. 
 * 
 * It adds more efficiency than to write data directly into a stream. 
 * 
 * So, it makes the performance fast. 
 * 
 * For adding the buffer in an OutputStream, use the BufferedOutputStream class
 * 
 * BufferedOutputStream(OutputStream os)	It creates the new buffered output 
 * stream which is used for writing the data to the specified output stream.
 * 
 * BufferedOutputStream(OutputStream os, int size)	It creates the new buffered 
 * output stream which is used for writing the data to the specified output 
 * stream with a specified buffer size.
 * 
 * void write(int b)	It writes the specified byte to the buffered output stream.
 * 
 * void write(byte[] b, int off, int len)	It write the bytes from the specified 
 * byte-input stream into a specified byte array, starting with the given offset
 * 
 * void flush()	It flushes the buffered output stream.
 * 
 * 
 * 
 */
package com.files.demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files006 {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("D:\\testout.txt");    
			
			bout=new BufferedOutputStream(fout);    
	     
			String s="Welcome to Anudip. And come here.....";  
			
			byte b[]=s.getBytes();   
			
			bout.write(b);    
		
						
			bout.flush();  // It flushes the buffered output stream.
						    
			System.out.println("success");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(bout != null)
					bout.close();
			
				if(fout != null)
					fout.close();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
