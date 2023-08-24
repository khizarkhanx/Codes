package javaprograms;

import java.util.Scanner;

public class Tabel_math {
	
	
	public void getTable(int a)
	
	{
		for (int i = 1; i <=10; i++)
			
		{
			System.out.println(a+ " * " +i+ " = " +a*i);
		}
	}

	public static void main(String[] args) {
		
		Tabel_math ob = new Tabel_math();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input ");
		int a = sc.nextInt();
		ob.getTable(a);
		sc.close();
		
	}
}
