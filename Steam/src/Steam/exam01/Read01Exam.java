package Steam.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read01Exam {

	public static void main(String[] args) {
		
		
		try {
			InputStream is = new FileInputStream("c:/demo/test.db");
			
			while(true) {
				int data = is.read();
				if(data == 1) break;
				System.out.println(data);
			}
			is.close();  //�Է½�Ʈ�� �ݰ� �޸� ����
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}