package fileIO;

import java.io.*;
import java.util.Scanner;

public class TestFileIO {

	public static void main(String[] args) {

		File file = new File("files");
	
		System.out.println("Does file exist? "+file.exists());
		
		File[] childFiles=file.listFiles();
		
//		for(int i=0;i<childFiles.length;i++) {
//			System.out.println(
//					childFiles[i].getName()+" size is "+
//					childFiles[i].length()+" last modified in "
//							+childFiles[i].lastModified());
//		}
		
		//The "score.txt" file is save in 
		//      object childFiles[0]
		System.out.println(
				childFiles[0].getName()+" size is "+childFiles[0].length());
		
		//1. Write data to file
//		try(PrintWriter scoreWriter = new PrintWriter(childFiles[0])) {
//			
//			scoreWriter.print("test2");
//			scoreWriter.print(" abc1");
//			scoreWriter.println(" qeqe");
//			
//		
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		//2. Read data from file
		
		try {
			Scanner fileReader = new Scanner(childFiles[0]);
//			System.out.println(fileReader.next());
//			System.out.println(fileReader.next());
//			

			while(fileReader.hasNext()) {
				System.out.println(fileReader.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("File length is: "+file.length());
//		System.out.println("Is it absolute: "+file.isAbsolute());

//		System.out.println("Is it absolute: "+file.delete());

	}

}
