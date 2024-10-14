package Package1;

public class Artmetic2 {
	public int multi(int a, int b) {
	int c;
	c=a*b;
	System.out.println("The Mutliply result is" +c);
	return c;
	}
	public int sub(int d, int e) {
		int f;
		f=d-e;
		System.out.println("The Substraction result is" +f);
		return f;
	}
	public int sub2(int g, int h) {
		int i;
		i=g-h;
		System.out.println("The sub2 result is" +i);
		return i;
	}
	public int sum(int j, int k) {
		int l;
		l=j+k;
		System.out.println("The Sum result is" +l);
		return l;
	}
	public void div(int m, int n) {
		int o;
		o=m/n;
		System.out.println("The final result is" +o);
	}
	public static void main(String [] args) {
		Artmetic2 FR = new Artmetic2();
		int mulresult=FR.multi(10, 2);
		int subresult=FR.sub(mulresult, 2);
		int subresult2=FR.sub2(subresult, 2);
		int sumresult=FR.sum(subresult2, 2);
		FR.div(sumresult, 2);
	}
}
