package chpt04.sec01;

import java.util.Scanner;

public class VendingMachineExam {
	
	//�ʵ�
	//������
	//�޼ҵ�
	
	public static final int MAX = 10; //�޴��� �ִ� ������ 10��

	//��������
	static String[] box = new String[MAX];
	static int[] price = new int[MAX];
	static int[] stock = new int[MAX];
	static int count = 3;
	static int admin = 1234;
	static int profit = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void init() {
		box[0] = "�ݶ�";
		price[0] = 1000;
		stock[0] = 3;
		
		box[1] = "���̴�";
		price[1] = 1200;
		stock[1] = 3;
		
		box[2] = "ȯŸ";
		price[2] = 1500;
		stock[2] = 3;
	}
	
	public static void admin() {
		while(true) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("�ݰ����ϴ� �����ڴ�");
			System.out.println("1: �޴����� 2: ���ݺ��� 3: ����߰� 4: �޴��߰� 5: ����Ȯ�� 0:����");
			System.out.print("��ȣ�� �Է��ϼ���.>>");
			int num = sc.nextInt();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			int i = 0; int j = 0;
			String name;
			switch(num) {
			case 1:
				System.out.print("������ �޴��� ��ȣ�� �Է� �ϼ���. (1 ~ "+count+") >>");
				i = sc.nextInt();
				
				System.out.print(box[i-1]+ "��(��) �������� �ٲٽðڽ��ϱ�?");
				name = sc.next();
				
				System.out.print(name + "�� ������ �󸶷� �Ͻðڽ��ϱ�? >> ");
		        int ii = sc.nextInt();
		        
				System.out.print(name + "�� ��� � ����Ͻðڽ��ϴٱ�?>>");
				int n = sc.nextInt();
				
				box[i-1] = name;
				price[i-1] = ii;
				stock[i-1] = n;
				System.out.print("���� �Ϸ� �Ǿ����ϴ�.");
				
				sc.close();
			break;	
			case 2:
				System.out.print("�� ������ ������ �޴��� ��ȣ�� �����ϼ���? >> ");
		        i = sc.nextInt();
		        System.out.print(box[i-1] + "�� ������ �󸶷� �Ͻðڽ��ϱ�? >> ");
		        j = sc.nextInt();
		        price[i-1] = j;
		        System.out.println("������ ���� �Ǿ����ϴ�");
				
			break;	
			case 3:
				
			break;	
			case 4:
				if(count >= MAX -1) {
					System.out.println("���̻� �޴��� �߰� �Ҽ������");
					continue;
				}else {
					System.out.print("�߰��� �޴��̸��� �Է��ϼ���.");
					sc.nextLine();
					name= sc.next();
					
					System.out.print("�߰��� �޴��� ����?");
					i= sc.nextInt();
					
					System.out.print("�߰��� �޴��� ���?");
					j= sc.nextInt();
					
					box[count] = name;
					price[count] = i;
					stock[count] = j;
					count++;
					System.out.println("�޴� �߰��� �Ϸ� �Ǿ����ϴ�.");

					}
			break;	
			case 5:
				System.out.println("��������� ������ "+profit+"�� �Դϴ�.");
			break;	
			case 0:
				user();
			break;	
			
			}
		}
	}
	//���� �������̽� ��� �޼ҵ�
	public static void user() {
		Boolean first = true;
		int money = 0;
		
		while(true) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("�ÿ��� ����� ���Ǳ� �Դϴ�.(��ȣ : ��ǰ(���))");
			//��ȣ: �޴�(����) - ���
			for(int i = 0; i<count;i++) {
				System.out.print((i+1) + ":" + box[i] + "(" + price[i] + "��) - " + stock[i]+"��    ");
			}
			System.out.println();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			if(first) {
				System.out.println("���� �־��ּ���: ");
				money = sc.nextInt();
				first = false;
			}
			
			if(money == 1234) {
				admin();
			}
			
			System.out.print("�޴��� �����ϼ���");
			int num = sc.nextInt();
			
			//������ Ȯ���ؼ� ���� ������� �˻�
			if(money >= price[num-1]) {
				//��� Ȯ��
				//��� ������� Ȯ��
	             if(stock[num-1] > 0) {
	                money = money - price[num-1];
	                stock[num-1]--;
	                profit += price[num-1];
	                System.out.println(box[num-1]+"�� ���Խ��ϴ�. �ÿ��ϰ� �弼��.");
	             }else {
	                System.out.println("���� ��� �����մϴ�.");
	                continue;
	             }
	          }else {
	             System.out.println("�ܾ��� �����մϴ�.");
	          }
	          
	          System.out.println("�ܾ� : " + money);
	          
	          if(money == 0) {
	             System.out.println("�����մϴ�. ������ �� �̿��� �ּ���.");
	             first = true;
	             continue;
	          }
	          
	          //���� �������� �� ��ӱ���, ���� �߰�, �ܵ���ȯ
	          System.out.println("1: ��� �����ϱ�  2: �ݾ� �߰��ϱ�  3: �ܵ���ȯ�ϱ�");
	          int num1 = sc.nextInt();
	          if(num1 == 1) {
	             continue;
	          }else if(num1 == 2) {
	             System.out.print("���� �־� �ּ���. >>");
	             int extra = sc.nextInt();
	             money += extra;
	             System.out.println("�ݾ��� �߰� �Ǿ����ϴ�. �ܾ� : " + money);
	          }else if(num1 == 3) {
	             System.out.println("�Ž��� �� " + money + "���� ��ȯ�˴ϴ�.");
	             System.out.println("�����մϴ�. �� �̿��� �ּ���.");
	             first = true;
	          }
	       }
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		user();
		return;
	}

}
