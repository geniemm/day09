package overloading;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 	overloading
		 	- 메소드의 이름을 동일하게 사용하는것
		 	- 서로 다른 메소드로 인식하기 위해서는 매개변수의 개수 또는 타입이 달라야한다.
		 	
		 */
		
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc(10,20);
		t.sumFunc("가", "나");
		
	
		
	}
}
