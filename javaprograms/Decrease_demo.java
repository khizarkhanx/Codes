package javaprograms;

import java.util.Scanner;

public class Decrease_demo {
	
	public void getDecrease(int a)
	
	{
		for (int i=a; i>=0 ;i--)
			
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		
		
		Decrease_demo ob = new Decrease_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		ob.getDecrease(a);
		sc.close();
		
		
		
	}

}
