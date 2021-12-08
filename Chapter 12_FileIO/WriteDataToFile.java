package fileIO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WriteDataToFile {

	public static void main(String[] args) {
		File scoreFile = new File("files/score.txt");
		
//		try {
//			Scanner input = new Scanner(scoreFile);
//			System.out.println(input.next());
//		
//		
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			URL url = new URL("https://www.google.com");
		
			Scanner input = new Scanner(url.openStream());
			System.out.println(input.next());
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
//		if(scoreFile.exists()) {
//			System.out.println("File already existed.");
//			System.exit(1);
//		}
		
		
//		try {
//			PrintWriter scoreWriter = new PrintWriter(scoreFile);
//			scoreWriter.print("Jack Lee");
//			scoreWriter.println(50);
//			scoreWriter.print("Peter Chen");
//			scoreWriter.println(150);
//		
//			scoreWriter.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		
		
	}

}
