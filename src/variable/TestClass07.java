package variable;

import java.util.Scanner;

public class TestClass07 {
	private int age;
	private String name;
	public void display() {
		
		/*
		 입력, 출력, 만나이로 연산하는 각각의 기능을 만드세요 
		 변수는 인스턴스 변수로 변경하여 사용하세요
		 */
	}
	public void inputNA() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("나이 입력");
		age = input.nextInt();
	}
	
	public void setAge() {	
		age=age-1;
	}
	
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("만 나이: "+age);
	}
}

