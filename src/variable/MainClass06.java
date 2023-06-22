package variable;

class TestClass06{
	
	public static int su;
	public void test() {
		su = 100;
		
	}
	/*
	 >> 위의 경우 static으로 미리 만들어진 su를 test()에서 가져올 수 있다.	
	 ## static은 생성시점이 중요
	 public int su;
	 public static void test(){su=100;} 
	 >> 이 경우에는 test()에서 static을 만들때 아직 su가 만들어지지 않았기때문에 에러발생	 	
	 */
	
}
public class MainClass06 {
	
	public static int num;
	public static void test() {
		num = 100;
	}
	public static void main(String[] args) {
		num=100; // >> main이 있는 클래스에서는 클래스지역변수를 사용하고싶으면 static으로 만들어라~
	}
}
