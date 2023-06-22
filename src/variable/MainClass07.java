package variable;

class TestClass07{
	public static final String KOREA = "대한민국";

	
}
class T01{
	public void test() {
		TestClass07 t = new TestClass07();
		System.out.println(t.KOREA);
	}
}
class T02{
	public void test() {
		//TestClass07 t = new TestClass07();
		System.out.println(TestClass07.KOREA);
	}	
}
public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		System.out.println(t.KOREA);
	}
}
