package Exam;

public class MembarService {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MembarService service = new MembarService();
		
		boolean rs = service.login("hong", "12345");
		
		System.out.println(rs);
		
		if(rs) {
			
		}
	}
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
}
