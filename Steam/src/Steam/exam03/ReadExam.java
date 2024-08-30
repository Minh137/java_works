package Steam.exam03;

import java.io.FileWriter;
import java.io.IOException;

public class ReadExam {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("c:/demo/test.txt");
			
	            writer.write("This is a simple text written to a file");
	            
	            writer.close();
	            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
