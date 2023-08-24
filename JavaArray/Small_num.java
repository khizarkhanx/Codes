package JavaArray;

import java.util.Scanner;

public class Small_num {
	
	Scanner sc = new Scanner(System.in);
	
	public void getSmall() {
		
		int a[] = new int[5];
		System.out.println("Enter any five numbers");
		
		for (int i=0; i<=4; i++) {
			
			a[i]= sc.nextInt();
			
		}
		
		int min = a[0];
		
		for (int k=1; k<=4; k++) {
			
			if (a[k]<min) {
				
				min = a[k];
			}
		}
		
		System.out.println(min+" is a smallest number");
		
	}
	
	
	public static void main(String[] args) {
		
		Small_num ob = new Small_num();
		ob.getSmall();
		
	}

}
