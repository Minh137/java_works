package Steam.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Whire02Exam {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("c:/demo/test2.db");
			
			byte[] array = {10, 20, 30};

			
			
			os.write(array);

			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
