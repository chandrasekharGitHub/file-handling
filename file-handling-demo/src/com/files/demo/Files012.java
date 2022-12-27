/*
 * 
 * Random Access Files
 * 
 * 	Using a random access file, we can read from a file as 
 * well as write to the file.
 * 
 * 
 * Reading and writing using the file input and output streams 
 * are a sequential process.
 * 
 * 
 * Using a random access file, we can read or write at any 
 * position within the file.
 * 
 * 
 * An object of the RandomAccessFile class can do the random 
 * file access. 
 * 
 * 
 * We can read/write bytes and all primitive types values to a file.
 * 
 * 
 * RandomAccessFile can work with strings using its readUTF() 
 * and writeUTF() methods.
 * 
 * The RandomAccessFile class is not in the class hierarchy of the 
 * InputStream and OutputStream classes.
 * 
 * 
 * A random access file can be created in four different access modes. 
 * 
 * The access mode value is a string. 
 * 
 * They are listed as follows:
 * 	1. "r"	The file is opened in a read-only mode.
 *  2. "rw"	The file is opened in a read-write mode. 
 *  	The file is created if it does not exist.
 *  3. "rws"	The file is opened in a read-write mode. 
 *  	Any modifications to the file's content and its metadata are 
 *  	written to the storage device immediately.
 *  4. "rwd"	The file is opened in a read-write mode.
 *  	Any modifications to the file's content are written to the 
 *  	storage device immediately.
 *  
 *  
 *  
 *   Read and Write
 *   
 *   We create an instance of the RandomAccessFile class by 
 *   specifying the file name and the access mode.
 *   
 *   RandomAccessFile  raf = new RandomAccessFile("randomtest.txt", "rw");
 *   
 *   A random access file has a file pointer that moves forward 
 *   when we read data from it or write data to it.
 *
 *   The file pointer is a cursor where our next read or write will start.
 *   
 *   Its value indicates the distance of the cursor from the 
 *   beginning of the file in bytes.
 *   
 *   We can get the value of file pointer by using 
 *   its getFilePointer() method.
 *   
 *   When we create an object of the RandomAccessFile class, 
 *   the file pointer is set to zero.
 *   
 *   We can set the file pointer at a specific location in the 
 *   file using the seek() method.
 *   
 *   The length() method of a RandomAccessFile returns the 
 *   current length of the file. 
 *   
 *   We can extend or truncate a file by using its setLength() method.
 *   
 *       
 */

package com.files.demo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

//  read and write Files Using a RandomAccessFile Object.

public class Files012 {
	public static void main(String[] args) throws IOException {
		String filename = "d:\\randomfile.txt";
		
		File file = new File(filename); // 
		
		if(!file.exists()) {
			initialWrite(filename);
			System.out.println("File created successfully.");
		}
		
		readFile(filename);
		readFile(filename);
		
	}

	private static void readFile(String filename)  {
		try {
		
		RandomAccessFile raf = new RandomAccessFile(filename,"rw" );
		
		int counter = raf.readInt();
		
		String msg = raf.readUTF();
		
		System.out.println(counter);
		System.out.println(msg);
		
		incrementReadCounter(raf);
		
		raf.close();
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	private static void incrementReadCounter(RandomAccessFile raf) throws IOException {
		
		long currentPosition = raf.getFilePointer();
		
		raf.seek(0);
		
		int counter = raf.readInt();
		
		counter++;
		
		raf.seek(0);
		
		raf.writeInt(counter);
		
		raf.seek(currentPosition);
	}

	private static void initialWrite(String filename) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile(filename, "rw");
		
		raf.writeInt(0);
		raf.writeUTF("Hello World.");
		
		raf.close();
		
	}

}
