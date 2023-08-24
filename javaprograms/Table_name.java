package javaprograms;

import java.util.Scanner;

public class Table_name {
	
	public void getName(String a)
	
	{
		for (int i = 1; i <=10; i++)
			
		{
			System.out.println(a+i);
		}
	}

	public static void main(String[] args) {
		
		Table_name ob = new Table_name();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name ");
		String a = sc.next();
		ob.getName(a);
		sc.close();
		
	}

}
