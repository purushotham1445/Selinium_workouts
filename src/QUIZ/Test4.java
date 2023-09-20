package QUIZ;

public class Test4 {
	public static void main(String[] args) {
		Example e1 = new Example();
		e1.x=10;
		e1.m1();
		Example e2 = new Example();
		e2.x=30;
		e1.m2(e2);
	}
}
class Example{
	int x;
	public void m1() {
		Example e = new Example();
		System.out.println(e.x);
		System.out.println(this.x);
	}
	public static void m2(Example e) {
		System.out.println(e.x);
		//System.out.println(x); // instance variables cannot access to static methods.
	}
}