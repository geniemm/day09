package this_;

class TestClass03{

	// alt+shift+s
	// 값을 설정 setter 
	// 값을 돌려줘 getter
	
	private int num,age;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setNum(int n) {
		this.num = n;
	}
	public int getNum() {
		return num;
	}
	// ==> 캡슐화가 진행되었다. 변수와 기능이 합쳐져있는것
	
}
public class MainClass03 {
	
	public static void main(String[] args) {
	
		TestClass03 t = new TestClass03();
		t.setNum(12345);
		int re = t.getNum();
		System.out.println("결과: "+re);
		
	}
}
