package Stream.exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExam {

   public static void main(String[] args) {
        //����� ��Ʈ�� ����
      String oFilePath = "c:/demo/01.gif";
      String nFilePath = "c:/demo/new01.gif";
      
      String oFilePath2 = "c:/demo/02.gif";
      String nFilePath2 = "c:/demo/new02.gif";
      

      try {
         
         //����� ��Ʈ�� ����
         FileInputStream fis = new FileInputStream(oFilePath);
         FileOutputStream fos = new FileOutputStream(nFilePath);
      
         //����� ���� ��Ʈ�� ����
         FileInputStream fis2 = new FileInputStream(oFilePath2);
         FileOutputStream fos2 = new FileOutputStream(nFilePath2);
         BufferedInputStream bis = new BufferedInputStream(fis2);
         BufferedOutputStream bos = new BufferedOutputStream(fos2);
         
         //���۸� ������� �ʰ� ����
         long nonBufferTime = copy(fis, fos);
         System.out.println("���� �̻��: " + nonBufferTime + "ns");

         //���۸� ����ؼ� ����
         long bufferTime = copy(bis, bos);
         System.out.println("���� ���: " + bufferTime + "ns");
         
         fis.close();
         fos.close();
         bis.close();
         bos.close();
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } 
      
   }
   
   public static long copy(InputStream is, OutputStream os) throws IOException {
      //���� �ð� ����
      long start = System.nanoTime();
      
      //1����Ʈ�� �а� 1����Ʈ�� ���
      while(true) {
         int data = is.read();
         if(data == -1) break;
         os.write(data);
      }
      os.flush();
      //���� �ð� ����
      long end = System.nanoTime();
      //�����ϴµ� �ɸ� �ð� ����
      return (end-start);
      
   }

}