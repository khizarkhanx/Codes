package javaprograms;

import java.util.Scanner;

public class CalMul_Demo {
	float a,b,c;
	public void mul()
	
	{
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter two inputs");
		a= sc.nextFloat();
		b= sc.nextFloat();
		c= a*b;
		System.out.println("Multiplication Result"+ c);
		
	}
public static void main(String[] args) 
{
	CalMul_Demo ob = new CalMul_Demo();
	ob.mul();
}
}
 