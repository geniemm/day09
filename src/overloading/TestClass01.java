package overloading;

public class TestClass01 {
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n1,int n2) {
		System.out.println(n1+n2); 
		// 합을구하는 기능으로 이름은 똑같지만 매개변수가 다르다. >> overloading
	}
	public void sumFunc(String s1, String s2) {
		// 매개변수의 타입이 달라도 다른 메소드로 인식
		System.out.println(s1+s2);
	}
}
