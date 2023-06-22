package variable;

public class TestMain {

	public static void main(String[] args) {
		/*
		 입력, 연산, 출력 기능을 만들어 주세요
		 입력 : 이름, 국, 영, 수
		 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
		 출력 : 이름, 국, 영, 수, 합, 평균, 등급
		 등급 : 평균이 90이상 A, 80이상 B 나머진 C
		 */
		TestClass t = new TestClass();
		t.inputFunc();
		t.sumFunc();
		t.avgFunc();
		t.gradeFunc();
		t.printFunc();
	}
}
