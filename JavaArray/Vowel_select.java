package JavaArray;

import java.util.Scanner;

public class Vowel_select {
	
	public void getVowel()
	
	{
		char a[]= new char[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any alphabet");
		
		for (int i=0; i<=4;i++)
		{
			a[i]= sc.next().charAt(0);
			
			
		}
		System.out.println("Result");
		
		
		for (int j=0; j<=4; j++)
		{
		
		
		if ( Character.toLowerCase(a[j]) == 'a' || Character.toLowerCase(a[j]) =='e' || Character.toLowerCase(a[j]) =='i'|| Character.toLowerCase(a[j]) =='o' ||  Character.toLowerCase(a[j]) =='u')
		{
			System.out.println( a[j] +" is vowel");
		}
		
		
		
		   else {
		
			System.out.println( a[j] +" is consonant");
		}
		}
		
		
	}

	public static void main(String[] args) {
		
		Vowel_select ob = new Vowel_select();
		ob.getVowel();
	}

	
	
}
		