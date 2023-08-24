package javaprograms;

import java.util.Scanner;

public class CalDiv_Demo {

	Float a,b,c;
	public void div()
	
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Please put two Inputs");
		a= sc.nextFloat();
		b= sc.nextFloat();
		c= a/b;
		System.out.println("Division Result=" + c);
		
		
	}
       public static void main(String[] args) {
		CalDiv_Demo ob = new CalDiv_Demo();
		ob.div();
	}

}

