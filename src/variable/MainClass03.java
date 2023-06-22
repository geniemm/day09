package variable;

class TestClass03{
	
	public int var; // 클래스에서 생성된 변수는 지역변수가아니고 인스턴스(객체) 변수
	//일회성으로 사용하는 변수를 인스턴스변수로 생성하는 순간 메모리에 할당된채로 쭉 유지되기때문에 메모리효율이 떨어진다.
	// 일회성은 그 지역에서 만들고 쓰고 없애라
	public void test01() {
		var = 100;
	}
	public void test02() {
		System.out.println(var);
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test01();
		t.test02();
		
	}
}
