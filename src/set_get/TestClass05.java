package set_get;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass05 {
	private ArrayList<String> id = new ArrayList<>();
	private ArrayList<String> pwd = new ArrayList<>(); 
	private String inputId, inputPwd;
	
	
	public void setId(ArrayList<String> id) {
		this.id = id;
	}
	public ArrayList<String> getId() {
		return id;
	}
	
	public void setPwd(ArrayList<String> pwd) {
		this.pwd = pwd;
	}
	public ArrayList<String> getPwd() {
		return pwd;
	}
	public void setInId(String inputId) {
		this.inputId = inputId;
	}
	public String getInId() {
		return inputId;
	}
	public void setInPwd(String inputPwd) {
		this.inputPwd = inputPwd;
	}
	public String getInPwd() {
		return inputPwd;
	}
	
	
	public void	inputLogin(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		inputId = input.next();
		System.out.print("비밀번호 입력: ");
		inputPwd = input.next();
		
		
	}
	
	public void jLogin() {
		if(id.contains(inputId)) {
			if(pwd.contains(inputPwd)) {
				System.out.println("인증 성공");
			}else {
				System.out.println("잘못된 비밀번호");
			}
		}else {
			System.out.println("존재하지 않는 아이디");
		}
	}
	
	public void inputSign() {
		Scanner input = new Scanner(System.in);
		System.out.print("새로운 아이디 입력: ");
		inputId = input.next();
		System.out.print("새로운 비밀번호 입력: ");
		inputPwd = input.next();
		
	}
	
	public void jSign() {
		if(id.contains(inputId)) {
			System.out.println("아이디 중복");
		}else {
			id.add(inputId);
			if(pwd.contains(inputPwd)) {
				System.out.println("비밀번호 중복");
			}else {
				pwd.add(inputPwd);
				System.out.println("가입 완료");
			}
		}
		
		
	}
}
