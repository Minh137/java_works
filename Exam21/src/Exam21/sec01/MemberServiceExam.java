package Exam21.sec01;

public class MemberServiceExam {

	public static void main(String[] args) {
		
		 MemberService memberService = new MemberService();
		
		 boolean loginResult = memberService.login("ezen", "12345");
	        if (loginResult) {
	            System.out.println("로그인 되었습니다.");
	        } else {
	            System.out.println("id또는 password가 올바르지 않습니다.");
	        }

	     memberService.logout("ezen");
	     
	     boolean wrongLoginResult = memberService.login("a", "b");
		    if (wrongLoginResult) {
		            System.out.println("로그인 되었습니다.");
		    } else {
		            System.out.println("id또는 password가 올바르지 않습니다.");
		    }

	}

}
