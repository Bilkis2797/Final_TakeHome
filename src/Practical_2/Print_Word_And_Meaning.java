package Practical_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Print_Word_And_Meaning {

	public static void main(String[] args) {
		
        HashMap<String, String[]> wordMeanings = new HashMap<>();
		
		try {
			String Path ="Containing word.txt";
			
            BufferedReader reader = new BufferedReader(new FileReader(Path));
		
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" = ");
                String word = parts[0];
                String[] meanings = parts[1].split(", ");
                wordMeanings.put(word, meanings);
            }
             reader.close();
		
             for (String word : wordMeanings.keySet()) {
	                System.out.println(word);
	                String[] meanings = wordMeanings.get(word);
	                for (int i = 0; i < meanings.length; i++) {
	                    System.out.println("meaning " + (i+1) + ": " + meanings[i]);
	                }
	            }
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
