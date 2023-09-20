package QUIZ;

public class TEST1 {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
class A {
	public void m1(int i){
		System.out.println(i);
	}
	public void m1(){
		System.out.println(10);
	}
}