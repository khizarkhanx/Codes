package javaprograms;

import java.util.Scanner;

public class Week {
	public void dayName(String day) {
		
		if (day.equals("Sunday"))
		{
			System.out.println("It is Holiday");
		}
		else if (day.equals("monday"))
		{
			System.out.println("It is 1st day");
		}
		else if (day.equals("tuesday"))
		{
			System.out.println("It is 2nd day");
		}
		else if (day.equals("wednesday"))
		{
			System.out.println("It is 3rd day");
		}
		else if (day.equals("thursday"))
		{
			System.out.println("It is 4th day");
		}
		else if (day.equals("friday"))
		{
			System.out.println("It is 5th day");
		}
		else if (day.equals("saturday"))
		{
			System.out.println("It is 6th day");
		}
	}
	
	
	public static void main(String[] args) {
		
		Week ob = new Week();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter day name");
		String day = sc.next();
		ob.dayName(day);
		sc.close();
		
	}

}
