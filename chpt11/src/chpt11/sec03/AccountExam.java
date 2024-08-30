package chpt11.sec03;

public class AccountExam {

   public static void main(String[] args) {
      
      Account acc = new Account();
      //예금하기
      acc.deposit(100000);
      System.out.println("예금액 : " + acc.getBarance());

      //출금하기 
      try {
         acc.withDraw(350000);
      } catch (minusException e) {
         //String message = e.getMessage();
         //System.out.println(message);
         e.printStackTrace();
      }
   }

}