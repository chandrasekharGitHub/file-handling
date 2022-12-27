/*
 * InputStream and OutputStream
 * 
 */

package com.files.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Files004 {
	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		
		 try {
	         byte bWrite [] = {11,21,3,40,5};
	         
	         os = new FileOutputStream("d:\\numbers.txt");
	         
	         for(int i = 0; i < bWrite.length ; i++) {
	            os.write( bWrite[i]);   // writes the bytes
	         }
	         
	         //os.close();
	     
	         is = new FileInputStream("d:\\numbers.txt");
	         
	         int size = is.available(); //The java.io.FileInputStream.available() 
	         // method returns number of remaining bytes that can be read from 
	         // this input stream without blocking by the next method call for 
	         // this input stream. The next method call can also be the another 
	         // thread.

	         for(int i = 0; i < size; i++) {
	            //System.out.print((char)is.read() + "  ");
	        	 
	        	 System.out.print(is.read() + "  ");
	         }
	         
	         //is.close();
	      } 
		 catch(FileNotFoundException ex) {
			 ex.printStackTrace();
		 }
		  catch (IOException e) {
	         System.out.print("Exception");
		  }
		  finally {
			  try {
				  if(os != null)
					  os.close();
				  
				  if(is != null)
					  is.close();
			  }
			  catch(IOException ex) {
				  ex.printStackTrace();
			  }
		  }
		 
	}

}
