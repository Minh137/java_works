package chpt11.sec03;

public class Account {
	private long balance;
	
	public long getBarance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws minusException {
		if(balance < money) {
			 throw new minusException("�ܰ� ���� : " + (money - balance) + " ���ڶ�");
	      }
		
		balance -= money;
	}
	public void withDraw() {
		// TODO Auto-generated method stub
		
	}
	
}