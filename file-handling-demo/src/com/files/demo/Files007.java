/*
 * 
Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.

The important points about BufferedInputStream are:

When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
When a BufferedInputStream is created, an internal buffer array is created.


 */
package com.files.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Files007 {

	public static void main(String[] args) {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		
		try {
			
			fin=new FileInputStream("D:\\testout.txt");    
			bin=new BufferedInputStream(fin);  
	     
			int i;    
		    while((i=bin.read())!=-1){    
		    	System.out.print((char)i);    
		    } 
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(bin != null)
					bin.close();
			
				if(fin != null)
					fin.close();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
