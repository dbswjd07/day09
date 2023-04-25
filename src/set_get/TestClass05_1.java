package set_get;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass05_1 {
	private ArrayList<String> id = new ArrayList<>();
	private ArrayList<String> pwd = new ArrayList<>();
	String inputId, inputPwd;
	
//	private String id;
//	private String pwd;
	
	public void setId(String id) {
		this.id.add(id);
	}
	
	public ArrayList<String> getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd.add(pwd);
	}
	
	public ArrayList<String> getPwd() {
		return pwd;
	}
	
	public void InputLogin() {
		Scanner input = new Scanner(System.in);
		System.out.print("아이디: ");
		inputId = input.next();
		System.out.print("비밀번호: ");
		inputPwd = input.next();
	}
	
	public void DisLogin() {
		if(id.contains(inputId)){
			if(pwd.contains(inputPwd)) {
				System.out.println("인증 통과");
			}else {
				System.out.println("잘못된 비밀번호");
			}
		}else {
			System.out.println("존재하지 않는 아이디");
		}
	}
	
	public void InputSign() {	
		Scanner input = new Scanner(System.in);
		System.out.print("새로운 아이디: ");
		inputId = input.next();
		System.out.print("새로운 비밀번호: ");
		inputPwd = input.next();
	}
	
	public void DisSign() {
		if(getId().contains(inputId)) {
			System.out.println("중복된 아이디");
		}else {
			setId(inputId);
			setPwd(inputPwd);
			System.out.println("가입 완료");
		}
		System.out.println(getId());
	}
		
}
