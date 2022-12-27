/*
 * Byte Streams
 * 
 * FileInputStream and FileOutputStream 
 * 
 * read():-- The java.io.InputStream.read() method reads the next byte of 
 * the data from the the input stream and returns int in the range of 0 to 255. 
 * 
 * If no byte is available because the end of the stream has been reached, 
 * the returned value is -1
 * 
 * 
 * 
 * write():-- The java.io.OutputStream.write(byte[] b, int off, int len) method 
 * writes len bytes from the specified byte array starting at offset off to 
 * this output stream. 
 * 
 * The general contract for write(b, off, len) is that some of the bytes in the 
 * array b are written to the output stream in order; element b[off] is the 
 * first byte written and b[off+len-1] is the last byte written by this operation.
 * 
 * The write method of OutputStream calls the write method of one argument 
 * on each of the bytes to be written out. 
 * 
 * Subclasses are encouraged to override this method and provide a more efficient 
 * implementation.
 * 
 * If b is null, a NullPointerException is thrown. If off is negative, or len is 
 * negative, or off+len is greater than the length of the array b, then an 
 * IndexOutOfBoundsException is thrown.
 * 
 * public void write(byte[] b, int off, int len)
 * 
 * Parameters
 * 
 * 	b − The data.
 * 	off − The start offset in the data.
 * 	len − The number of bytes to write.
 * 

 * out.close():-- The java.io.FileOutputStream.close() closes this file output 
 * stream and releases any system resources associated with this stream.
 * 
 * in.close():-- The java.io.FileInputStream.close() closes this file input 
 * stream and releases any system resources associated with the stream.
 * 
 * 
 * 
 */

package com.files.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files001 {
	public static void main(String[] args)  {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
					
			in = new FileInputStream("D://input.txt");
			out = new FileOutputStream("D://output.txt");
			
			int c;
			
			//c = in.read();
			
			while((c=in.read()) != -1) {
				out.write(c);
				//c=in.read();
			}
			
			System.out.println("The file has created successfully");
			
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
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
