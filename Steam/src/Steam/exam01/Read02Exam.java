package Steam.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read02Exam {

	public static void main(String[] args) {
		
		
		try {
			InputStream is = new FileInputStream("c:/demo/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				for(int i = 0;i< num;i++) {
					System.out.println(data[i]);
				}
			}
			is.close();  //입력스트림 닫고 메모리 해제
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
