package set_get;

import java.util.Scanner;

class TestClass03{
	private String name;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	

}
public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		TestClass03 t = new TestClass03();
		t.setName("홍길동");
		t.setAge(input.nextInt());
		System.out.println(t.getName());
		
		t.setAge(20);
		int age = t.getAge();
		System.out.println(age);
		
		
	}
}
