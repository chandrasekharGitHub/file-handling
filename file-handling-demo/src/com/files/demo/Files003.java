/*
* InputStreamReader
 * 
 * 
 * 
 */

package com.files.demo;

import java.io.IOException;
import java.io.InputStreamReader;



public class Files003 {
	public static void main(String[] args) {
		
		InputStreamReader cin=null;
		try {
			
			cin = new InputStreamReader(System.in);
			
			System.out.println("Enter characters, 'q' to quit: ");
			
			char c;
			
			do {
				
				c = (char)cin.read();
				
				if(c != 'q')
					System.out.print(c);
			} while(c != 'q');
			
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				if(cin != null)
					cin.close();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
