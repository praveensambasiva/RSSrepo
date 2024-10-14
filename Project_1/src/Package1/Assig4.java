package Package1;

public class Assig4 {
	public Assig4() {
		this(1,2,3);
		System.out.println("print as default constructor");
	}
	public Assig4(int a) {
		this(5, 6);
		System.out.println("print as single parameter constructor");
	}
	public Assig4(int b, int c) {
		this();
		System.out.println("print as double parater constructor");
	}
	public Assig4(int d, int e, int f) {
		System.out.println("print as three parameter constructor");
	}
	public static void main(String[] args) {
		Assig4 ind = new Assig4(33);
	}
}
