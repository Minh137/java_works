package chpt13.sec01;

public class GenericExam2 {

	public static void main(String[] args) {
		
		//K Tv 타입 M String
		Product<Tv, String> product1 = new Product<>();
		
		//Setter는 반드시 
		product1.setKind(new Tv());
		product1.setModel("OLED");
		
		Tv tv =product1.getKind();
		String model = product1.getModel();
	}

}
