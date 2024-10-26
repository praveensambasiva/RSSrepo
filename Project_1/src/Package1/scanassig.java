package Package1;

import java.util.Scanner;

public class scanassig {
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
	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		System.out.println("Enter b value");
		int x2 = s.nextInt();
		scanassig sc = new scanassig();
		int sumresult = sc.sum(x1, x2);
		System.out.println("Enter value of d");
		int x3 = s.nextInt();
		int subresult = sc.sub(sumresult, x3);
		System.out.println("Enter value of e");
		int x4 = s.nextInt();
		int sumresult1 = sc.sum(x4, subresult);
		System.out.println("Enter value of g");
		int x5 = s.nextInt();
		int mulresult= sc.multiply(x5, sumresult1);
		System.out.println("Enyter value of j");
		int x6 = s.nextInt();
		sc.div(mulresult, x6);
		
		
	}

}
