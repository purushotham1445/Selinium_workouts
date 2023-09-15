package LEARNINGMONKEY;

class A1{
	int p;
	void m1() {
		System.out.println("Class A");
	}
}
class B1 extends A1{
	int q;
	void m1() {
		System.out.println("Class B");
	}
}
public class NO_3_SingleInheritance2 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.m1();
		B1 b=new B1();
		b.m1();
	}
}