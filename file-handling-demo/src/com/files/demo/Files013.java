package com.files.demo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Files013 {
	public static void main(String[] args) {
		try {
			// file content is "ABCDEFGH"
			String filePath = "d:\\source.txt"; 
			
			System.out.println(new String(readCharsFromFile(filePath, 0, 8)));

			writeData(filePath, "Data", 5);
			//now file content is "ABCDEData"
			
			appendData(filePath, "Pankaj");
			//now file content is "ABCDEDataPankaj"
			
			System.out.println(new String(readCharsFromFile(filePath, 0, 15)));
			
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	
	private static void appendData(String filePath, String data) throws IOException {
		RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
		raFile.seek(raFile.length());
		System.out.println("current pointer = "+raFile.getFilePointer());
		raFile.write(data.getBytes());
		raFile.close();
		
	}
	
	private static void writeData(String filePath, String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	}
	
	private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}


}
