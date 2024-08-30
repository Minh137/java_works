package Steam.exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {

    public static void main(String[] args) {
        
        String oFilename = "c:/demo/01.gif"; // Removed trailing slash
        String nFilename = "c:/demo/02.gif"; // Removed trailing slash
        try {
            InputStream is = new FileInputStream(oFilename);
            OutputStream os = new FileOutputStream(nFilename);
            
            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }
            // is.transferTo(os); // Java 9 이상에서 가능
            
            os.flush();
            os.close();
            is.close();
            
            System.out.println("복사완료");
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}