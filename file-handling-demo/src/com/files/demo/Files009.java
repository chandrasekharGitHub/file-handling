/*
 * 
 * 
 * The InflaterInputStream class is used to decompress the file 
in the deflate compression format. 
 * It provides facility to the other decompression filters, 
 * such as GZIPInputStream class.
 * 
 * 
 */
package com.files.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;

public class Files009 {
	public static void main(String[] args) {
		try{  
			FileInputStream fin=new FileInputStream("def");  
			InflaterInputStream in=new InflaterInputStream(fin);   
			FileOutputStream fout=new FileOutputStream("some.docx");    
			  
			int i; 
			
			while((i=in.read())!=-1){  
				fout.write(i);  
				fout.flush();  
			}  
			
			fin.close();  
			fout.close();  
			in.close();    
		}
		catch(Exception e){
			System.out.println(e);
		}  
	
		System.out.println("rest of the code");  
	}  

}
