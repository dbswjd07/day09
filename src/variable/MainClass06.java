package variable;
class TestClass06{
	private int num = 100;
	public void test() {
		num = 1111;
	}
	public void test2() {
		System.out.println(num);
	}
	public static final String KOREA = "대한민국";
	public static final String PATH = "C드라이브 특정 위치";
}
public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		
		t.test();
		t.test2();
	}
}
