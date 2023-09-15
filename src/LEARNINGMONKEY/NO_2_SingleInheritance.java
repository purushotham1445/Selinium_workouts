package LEARNINGMONKEY;

class A{
	int p=40;
	void m1() {
		System.out.println("Hello");
	}
}
class B extends A{
	int q=50;
	void m2() {
		int sum=p+q;
		System.out.println(sum);
	}
}
public class NO_2_SingleInheritance {
	public static void main(String[] args) {
		A a= new A();
		a.m1();
		B b = new B();
		b.m2();
		b.m1();
	}
}