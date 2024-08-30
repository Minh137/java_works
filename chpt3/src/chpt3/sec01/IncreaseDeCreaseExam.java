package chpt3.sec01;

public class IncreaseDeCreaseExam {

	public static void main(String[] args) {
		
		int x = 10, y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		System.out.println("-------------------");
		
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println("-------------------");
		
		z = y++;
		System.out.println("z=" + z);
		System.out.println("y=" + y);
		System.out.println("-------------------");
		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("-------------------");
		
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("-------------------");
	}

}
