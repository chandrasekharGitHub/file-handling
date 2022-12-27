/*
 * 
 * Java File class represents the files and directory pathnames in an abstract 
 * manner.
 * This class is used for creation of files and directories, file searching, 
 * file deletion, etc.
 * 
 * 
 * 
 */
package com.files.demo;

import java.io.File;

public class Files005 {

	public static void main(String[] args) {
		File f = null;
	      
		String[] strs = {"test.some", "test2.txt", "008files.exe"};
	
	      try {
	         // for each string in string array 
	         for(String s:strs ) {
	            // create new file
	            f = new File(s);
	            
	            // true if the file is executable
	            boolean bool = f.canExecute(); 
	            
	            //The java.io.File.canExecute() method returns true if the 
	            //file can be executed by its abstract name.
	            
	            // find the absolute path
	            String a = f.getAbsolutePath(); 
	            // The java.io.File.getAbsolutePath() method returns the absolute pathname string of this abstract pathname.
	            
	            // prints absolute path
	            System.out.print(a);
	            
	            // prints
	            System.out.println(" is executable: "+ bool);
	         } 
	      } 
	      catch (Exception e) {
	         // if any I/O error occurs
	         e.printStackTrace();
	      }
	      
	      finally {
	    	    
	      }

	}

}
