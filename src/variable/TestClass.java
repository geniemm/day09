package variable;

import java.util.Scanner;

public class TestClass {
	public  String name,grade;
	public  int kor,eng,math,sum;
	public  double avg;
	
	public void inputFunc() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		math = sc.nextInt();

	}
	public void sumFunc() {
		sum =kor+eng+math;
		//System.out.println("세 과목의 합: "+sum);
	}
	public void avgFunc() {
		avg = sum/3;
	}
	public void gradeFunc() {
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		default:
			grade = "C";
			break;
		}
	}
	public void printFunc() {
		System.out.println("-------------");
		System.out.println("이름: "+name);
		System.out.println("-------------");
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("-------------");
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("등급: "+grade+"등급");
		System.out.println("-------------");
	}
}
		
	

