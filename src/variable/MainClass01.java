package variable;
/*
 클래스 변수 (class variable)
 - 클래스가 메모리에 올라가는 순간 생성된다
 - 크래스 이름으로 접근 가능하다
 객체생성 변수 (instance variable)
 - 객체가 생성되어야만 사용 가능한 변수
 - 객체로 접근하여 사용한다
 지역 변수 (local variable)
 - 특정 지역에서만 사용 가능한 변수
 - 범위지정은 중괄호이다
 */

public class MainClass01 {
public static void main(String[] args) {
	int num = 100;
	if(true) 
	{
		num = 200;
		int abc = 100;
	}
	System.out.println(num);
	//System.out.println(abc);
}
}
