package Exam;

public class ShopService {
	private static ShopService singletone = new ShopService();
	private ShopService() {
		
	}
	static ShopService getInStance() {
		return singletone;
	};
}
