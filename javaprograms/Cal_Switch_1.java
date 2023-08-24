package javaprograms;

import java.util.Scanner;

public class Cal_Switch_1 {

	int a, b, c, ch;
	
	public void getcal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any number: (1,2,3 or 4):");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		int ch = sc.nextInt();
		
		
		switch (ch) {
		
		case 1:
		{
			System.out.println("Enter two inputs");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c= 	a+b;
			System.out.println("Result= "+c );
			break;
		}
		
		case 2:
		{
			System.out.println("Enter two inputs");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c= 	a-b;
			System.out.println("Result= "+c );
			break;
		}
		
		case 3:
		{
			System.out.println("Enter two inputs");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c= 	a*b;
			System.out.println("Result= "+c );
			break;
		}
		
		case 4:
		{
			System.out.println("Enter two inputs");
			int a = sc.nextInt();
			int b = sc.nextInt();
			c= 	a/b;
			System.out.println("Result= "+c );
			break;
		}
		
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {
		Cal_Switch_1 ob = new Cal_Switch_1();
		ob.getcal();
	}
	
}
