package Practical_2;

import java.io.File;

public class Test_File {

	public static void main(String[] args) {
		
		String path = "src\\Practical_2\\Test_File.java";
		if(Test_File.doesFileExist(path)) {
			System.out.println("The file exists at the given path.");
		}else {
			System.out.println("The file does not exist at the given path.");
		}
	}
	
	public static boolean doesFileExist(String path) {
		
		File file = new File(path); 
		
		try {
			return file.exists();
		}catch(Exception e){
			return false;
		}
		
	}
}
