package chpt11.sec03;

public class AccountExam {

   public static void main(String[] args) {
      
      Account acc = new Account();
      //�����ϱ�
      acc.deposit(100000);
      System.out.println("���ݾ� : " + acc.getBarance());

      //����ϱ� 
      try {
         acc.withDraw(350000);
      } catch (minusException e) {
         //String message = e.getMessage();
         //System.out.println(message);
         e.printStackTrace();
      }
   }

}