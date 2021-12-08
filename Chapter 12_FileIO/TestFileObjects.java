package fileIO;

import java.io.*;

public class TestFileObjects {

	public static void main(String[] args) {
		File docFile = new File("docs");
		System.out.println("Is existed? "+docFile.exists());
		File[] filesUnderDocs =docFile.listFiles(); 
		System.out.println("The number of elements is "+filesUnderDocs.length);
		
		System.out.println("Is docFile object a file? "+docFile.isFile());
		System.out.println("Is docFile object a folder? "+docFile.isDirectory());

		
		for(int i =0;i<filesUnderDocs.length;i++) {
			if(filesUnderDocs[i].isDirectory()) {
				System.out.println(filesUnderDocs[i].getName()+"is a folder");
				
				System.out.println(filesUnderDocs[i].delete());
			}
			else {
				System.out.println(filesUnderDocs[i].getName()+" is a file ");
				System.out.println(filesUnderDocs[i].delete());
			
			}
		}
		
		
		
	}

}
