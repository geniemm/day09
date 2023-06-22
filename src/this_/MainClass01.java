package this_;

class TestClass01{
	public int num =12345;
	public void test() {
		int num = 6780; 
		// 밖에도 지역에도 동일한 num이 존재할때, num은 지역을 우선하기 때문에 
		// 바깥에있는 num을 사용하고싶으면 this.num을 호출
		System.out.println("this: "+this); // this == t 값이 동일. 사용하는 방법이 같다.
		System.out.println("test: "+num);
		System.out.println("test this: "+this.num);
		
	}
	
}
		/*
		 	this 
		 	- 메소드의 0번째 매개변수로 자동으로 만들어진다.
		 	- 클래스 자기자신의 정보를 가지고 있는 변수
		*/
public class MainClass01 {

	public static void main(String[] args) {
		
		TestClass01 t = new TestClass01(); // t: 주소정보를 갖고있는 참조변수 
		System.out.println("t: "+t);
		System.out.println("main: "+t.num); 
		t.test(); 
		
	}
}
