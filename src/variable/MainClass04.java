package variable;
class TestClass04{
	static int num = 1000;
	int abc;
	public void test1() {
		test2();
		abc = 100;
	}
	public void test2() {}
}
public class MainClass04 {
	int num = 2222;
public static void main(String[] args) {
	TestClass04.num = 4444;
//	test();
//	num = 100;
	
}
public void test() {System.out.println("test");}
}
