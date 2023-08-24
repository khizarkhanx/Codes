package javaprograms;

import java.util.Scanner;

public class Even_odd {
	
	int result;
	
	public void getEvenOdd( int x )
	{
		if (result == x%2)
			
		{
			System.out.println("Its Even Number");
		}
		
		else
		{
			System.out.println(" Its Odd Number");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Even_odd ob = new Even_odd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int x = sc.nextInt();
		ob.getEvenOdd(x);
		sc.close();
	}

}
