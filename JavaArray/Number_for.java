package JavaArray;

import java.util.Scanner;

public class Number_for {
	
	Scanner sc = new Scanner(System.in);
	
	public void getNum()
	{
		
		int a[] = new int[5];
		
		System.out.println("Enter any Five numbers");
		
		for (int i=0; i<=4; i++ )
		{
			a[i] = sc.nextInt();
			
		}
		
		for (int k=0; k<=4; k++)
			
		{
			if (a[k]<=10)
			{
				System.out.println("It is a smaller number: "+ a[k]);
			}
			
			else if (a[k]>=10 && a[k]<=50)
			{
				System.out.println("It is a medium number: "+ a[k]);
			}
			
			else 
			{
				System.out.println("It is a large number: "+ a[k]);
			}
			
		}
			
	}
	
	
	
	public static void main(String[] args) {
		
		Number_for ob = new Number_for();
		
		ob.getNum();
		
		
	}

}
