package javaprograms;

import java.util.Scanner;

public class MegaMart_Bill {

	String name, productname;
	long mobile;
	float amount, totalamount, gst;
	
	 
	public void bill()

	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your Name");
		name= sc.next();
		
		System.out.println("Please enter Product name");
		productname= sc.next();
		
		System.out.println("Please entre your Mobile number");
		mobile = sc.nextLong();
		
		System.out.println("Please entre amount");
		amount = sc.nextFloat();
		GstCalculator_1 ob = new GstCalculator_1();
		gst = ob.getGst(amount);
		totalamount= amount + gst;
		
		System.out.println("****Vishal Mega Mart Bill******");
		System.out.println("Name="+ name);
		System.out.println("Product Name="+productname);
		System.out.println("Mobile Number="+ mobile);
		System.out.println("Amount="+ amount);
		System.out.println("GST ="+ gst);
		System.out.println("_____________________________________");
		System.out.println("Total amount of product="+ totalamount);
		System.out.println("_____________________________________");
		
		
		
	}
	
	public static void main(String[] args) {
		MegaMart_Bill ob = new MegaMart_Bill();
		ob.bill();
		
		
	}
}

