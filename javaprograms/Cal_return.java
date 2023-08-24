package javaprograms;

import java.util.Scanner;

public class Cal_return {
	public int add( int a, int b)
	
	{
		int c= a+b;
		return c;
	}
	

	public int sub(int a, int b)
	{
		int c = a-b;
		return c;
	}

	public int mul(int a, int b)
	{
		int c = a*b;
		return c;
	}
	
	public int div(int a, int b)
	{
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Cal_return ob = new Cal_return();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two inputs");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int add = ob.add(a, b);
		int sub = ob.sub(a, b);
		int mul = ob.mul(a, b);
		int div = ob.div(a, b);
		sc.close();
		System.out.println("Addition result:" +add);
		System.out.println("Subtraction result:" +sub);
		System.out.println("Multiplication result:" +mul);
		System.out.println("Division result:" +div);
		
		
	}
}
