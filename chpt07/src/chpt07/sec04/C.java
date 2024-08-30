package chpt07.sec04;

public class C extends A{
		
		//持失切
		public C() {
			super();  //A()持失切 硲窒	
		}
		
		public void method1() {
			this.field = "value";
			this.method();
					
		}
}

