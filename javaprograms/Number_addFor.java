package javaprograms;

import java.util.Scanner;

public class Number_addFor {
	
	public void getAdd(int a )
	
	{
	
		for (int i=1; i<=10;i++)
			
			System.out.println("output is "+ (i+a));
		
	}

	
	public static void main(String[] args) {
		Number_addFor ob =new Number_addFor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = sc.nextInt();
		ob.getAdd(a);
		sc.close();
		
		
	}
}
