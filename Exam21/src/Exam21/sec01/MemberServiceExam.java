package Exam21.sec01;

public class MemberServiceExam {

	public static void main(String[] args) {
		
		 MemberService memberService = new MemberService();
		
		 boolean loginResult = memberService.login("ezen", "12345");
	        if (loginResult) {
	            System.out.println("�α��� �Ǿ����ϴ�.");
	        } else {
	            System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
	        }

	     memberService.logout("ezen");
	     
	     boolean wrongLoginResult = memberService.login("a", "b");
		    if (wrongLoginResult) {
		            System.out.println("�α��� �Ǿ����ϴ�.");
		    } else {
		            System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		    }

	}

}
