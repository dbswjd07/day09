package set_get;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true){
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			TestClass05 t = new TestClass05();
			
			switch(num) {
			case 1:
				System.out.print("아이디 입력: ");
				t.setInId(input.next());
				System.out.print("비밀번호 입력: ");
				t.setInPwd(input.next());
				//t.inputLogin();
				t.jLogin();
				break;
			case 2:
				t.inputSign();
				t.jSign();
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(1);
			}
			
		}
		
	}
}
