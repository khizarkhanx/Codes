package javaprograms;

import java.util.Scanner;

public class Product_GST {
	
	public void gst(float amount)
	
	{
		if ( amount < 1000){
			
			amount = amount*5/100 + amount;
			
		
			System.out.println("Total amount with 5% GST= " + amount);
		}
		
		else if ( amount >=1000& amount <=2000){
			
			amount = amount*10/100 + amount;
		
			System.out.println("Total amount with 10% GST= " + amount);
		}
		
		else if (amount >2000){
			
			amount = amount*18/100 + amount;
		
			System.out.println("Total amount with 18% GST= " + amount);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		Product_GST ob = new Product_GST();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Amount");
		float amount = sc.nextFloat();
		ob.gst(amount);
		sc.close();
		
		
	}

}
