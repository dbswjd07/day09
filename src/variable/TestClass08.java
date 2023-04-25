package variable;

import java.util.Scanner;

public class TestClass08 {
	private String name;
	private char grade;
	private int kor,eng,math,sum;
	private double avg;
	
	/*
	 *입력, 연산, 출력 기능 만들기
	 *입력: 이름,국,영,수
	 *연산: 합을 구하는 기능 , 평균을 구하는 기능, 등급을 구하는 기능
	 *출력: 이름, 국, 영,수 ,합,평균, 등급
	 *등급: 평균이 90이상 A, 80이상 B, 나머진 C
	 */
	
	public void myInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름: ");
		name = input.next();
		System.out.print("국어 성적: ");
		kor = input.nextInt();
		System.out.print("영어 성적: ");
		eng = input.nextInt();
		System.out.print("수학 성적: ");
		math = input.nextInt();
	}
	
	public void set() {
		sum = kor+eng+math;
		
		avg = sum/3.0;
		
		
		switch((int)avg/10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		default:
			grade = 'C';	
		}
		
	}
	
	public void print() {
		System.out.println();
		System.out.println("====== 성적표 ======");
		System.out.println("  이름  : "+name);
		System.out.println("국어 성적: "+kor);
		System.out.println("영어 성적: "+eng);
		System.out.println("수학 성적: "+math);
		System.out.println("  합계  : "+sum);
		System.out.println("  평균  : "+avg);
		System.out.println("  등급  : "+grade);
	}
}
