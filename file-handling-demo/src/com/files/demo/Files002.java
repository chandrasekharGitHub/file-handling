/*
 * 
 * Character Streams
 * 
 * FileReader and FileWriter
 * 
 * FileReader
 * 
 * FileWriter
 * 
 */

package com.files.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Files002 {
	public static void main(String[] args) {
		
		
		FileReader in = null;
		FileWriter out = null;
		
		try {
			
			in = new FileReader("D://test.bat");
			out = new FileWriter("D://anish//output.txt");
			
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
			}
			
			System.out.println("success");
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(in != null)
					in.close();
				
				if( out != null) 
					out.close();
				
			}
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
