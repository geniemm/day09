package this_;

class TestClass02{
	
	private int num; //은닉화: 외부로부터 노출을 숨김 
	public void test(int n) {
		num = n;
	}
	// 1. int num은 은닉화 > 외부접근못함 > 해당지역에서 메소드를 통해 num을 활용
	public int test2() {
		return num;
	}
	
}
public class MainClass02 {

	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		// 2. t 객체 생성, 참조형 변수 t는 TestClass02를 가리킴
		int n = 12345;
		t.test(n);
		// 3. n의 값을 test메소드에 넣어
		int re = t.test2();
		// 4. 직접 num에 접근할수없으니까 test2라는 메소드를 만들어서 접근하자
		System.out.println("결과: "+re);
	
	}
}


