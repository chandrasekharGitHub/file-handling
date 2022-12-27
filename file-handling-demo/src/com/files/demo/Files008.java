/*
 * 
 * 
 * The DeflaterOutputStream and InflaterInputStream classes 
	provide mechanism to compress and decompress the data in the 
	deflate compression format
 * 
 * The DeflaterOutputStream class is used to compress the data in 
 * the deflate compression format. 
 * 
 * It provides facility to the other compression filters, such as
 * GZIPOutputStream.
 * 
 * 
 */
package com.files.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Files008 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		DeflaterOutputStream out = null;
		
		try{  
			fin=new FileInputStream("resume.docx");  
			fout=new FileOutputStream("def");  
			
			out=new DeflaterOutputStream(fout);  
			  
			int i;  
			while((i=fin.read())!=-1){  
				out.write(i);  
				out.flush();  
			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}  
		
		finally {
		
			if(out != null)
				try {
					out.flush();
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		
			if(fin != null)
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
			if(fout != null)
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		
	
		System.out.println("rest of the code");  
	}  

}
