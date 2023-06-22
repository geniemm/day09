package variable;
class TestClass05{
	// static : 클래스 변수로 만들어줌
	public static String msg = "연습"; // 클래스 변수 만들어지는 시점을 기억하자
	public int num;
	
	
}
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println(TestClass05.msg);

		TestClass05 t = new TestClass05();
		System.out.println(t.msg);
		
		
		
	}
}
