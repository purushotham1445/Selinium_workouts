package QUIZ;

class Constructors {
	Constructors(double d){
		this(10);
		System.out.println("Double constructor");
	}
	Constructors(int i){
		this(10.5f);
		System.out.println("Int constructor");
	}
	Constructors(float f){
		this();
		System.out.println("Float constructor");
	}
	Constructors(){
		System.out.println("No Argument constructor");
	}
	public static void main(String[] args) {
		Constructors cns = new Constructors(10.5);
	}
}