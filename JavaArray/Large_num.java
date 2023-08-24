package JavaArray;

import java.util.Scanner;

public class Large_num {
	
	Scanner sc = new Scanner(System.in);
	
	public void getLarge()
	{
		int a[] = new int[5];
		System.out.println("Enter any five numbers");
		
		for (int i=0; i<=4; i++)
		{
			a[i]= sc.nextInt();
		}
		
		int max = a[0];
		for (int i=0; i<=4; i++)
		{
		if ( a[i]>max)
		{
			max = a[i];
		}
		}
		
		System.out.println(max + " is a greatest number");
	}

	public static void main(String[] args) {
		
		Large_num ob = new Large_num();
		ob.getLarge();
		
	}
}
