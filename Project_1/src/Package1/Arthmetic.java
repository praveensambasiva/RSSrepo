package Package1;

public class Arthmetic {
	public int sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("The Sum of a + b is"+c);
		return c;
	}
	public int sub(int d, int e) {
		int f;
		f=d-e;
		System.out.println("the substraction of d-e is"+f);
		return f;
	}
	public int multiply(int g, int h) {
		int i;
		i=g*h;
		System.out.println("the multiplication of g*h is"+i);
		return i;
	}
	public void div(int j,int k) {
		int l;
		l=j/k;
		System.out.println("Final Result is"+l);
	}
	public static void main(String [] args) {
		Arthmetic Result = new Arthmetic();
		int sumresult= Result.sum(10, 2);
		int subresult=Result.sub(sumresult, 2);
		int sumresult2=Result.sum(subresult, 2);
		int mulresult=Result.multiply(sumresult2, 2);
		Result.div(mulresult, 2);
		}
}
