package QUIZ;

public class TEST2 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.m1('a');
	}
}
class A1{
	public void m1(int a){
		System.out.println("Integer Method");
	}
	public void m1(float b){
		System.out.println("Float method");
	}
}
