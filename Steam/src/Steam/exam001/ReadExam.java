package Steam.exam001;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExam {

	public static void main(String[] args) {
		
		 try {
			FileReader reader = new FileReader("c:/demo/test.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
