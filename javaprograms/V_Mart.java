package javaprograms;

import java.util.Scanner;

public class V_Mart {
	
	float total, gst;
	
	public void getGST( String name, long mobile, String productname, float amount ) {
		
		gst = (18*amount)/100 ;
		total = gst + amount;
		System.out.println("------------------------------");
		System.out.println("--------VISHAL_MEGA_MART-------");
		System.out.println("------------------------------");
		System.out.println("Name:           "+name);
		System.out.println("Mobile Number:  "+mobile);
		System.out.println("Product Name:   "+productname);
		System.out.println("Product Amount: "+amount);
		System.out.println("GST applied:    "+gst);
		System.out.println("------------------------------");
		System.out.println("Total Amount:   "+total);
		System.out.println("------------------------------");
		
		
	}
	
	
	public static void main(String[] args) {
		
		V_Mart ob = new V_Mart();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your Mobile Number");
		long mobile= sc.nextLong();
		System.out.println("Enter product name");
		String productname = sc.next();
		System.out.println("Enter product Amount");
		float amount= sc.nextFloat();
		ob.getGST(name, mobile, productname, amount );
		sc.close();
		
		
		
	}

}
