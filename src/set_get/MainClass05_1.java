package set_get;

import java.util.Scanner;

public class MainClass05_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		TestClass05_1 t = new TestClass05_1();
		
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				t.InputLogin();
				t.DisLogin();
				break;
			case 2:
				t.InputSign();
				t.DisSign();
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(1);
			}
			
			
		}
		
	}
}
