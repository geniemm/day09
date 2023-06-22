package variable;

class TestClass02{
	//보통 하나의 파일에는 하나의 클래스만 넣어서 사용한다.
	public int test01() {
		int var = 100;
		System.out.println("test1 var : "+var);
		return var;
	}
	public void test02(int var) {
	
		System.out.println("test2 var : "+var);
	}

}
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		int v = t.test01();
		t.test02(v);
	}
}
