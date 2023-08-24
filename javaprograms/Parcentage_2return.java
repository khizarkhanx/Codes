package javaprograms;

import java.util.Scanner;



public class Parcentage_2return {
	
	float parcentage, total;
	
	public void marks(String  name, String fname, String collname, long  rollno, int hindi, int science, int english, int computer, int maths )
	
	{
		if ( hindi < 33 || science < 33 || english < 33 || computer < 33 || maths < 33)
		{
			System.out.println("Fail");
		}
		else
		{
			total= hindi+science+english+computer+maths;
			
			parcentage= total*100/500;
			System.out.println("****Marksheet***");
			System.out.println("***CBSE Board****");
			System.out.println("**High School Examination 2022-23**");
			System.out.println("Name:"+name);
			System.out.println("Father's Name:"+fname);
			System.out.println("Collage Name:"+ collname);
			System.out.println("Roll Number:"+ rollno);
			System.out.println("Hindi Marks:"+ hindi);
			System.out.println("Science Marks:"+ science);
			System.out.println("English Marks:"+ english);
			System.out.println("Computer Marks:"+ computer);
			System.out.println("Maths Marks:"+ maths);
			System.out.println("______________________________");
			System.out.println("Total Obtained Marks:"+ total);
			System.out.println("Parcentage:"+ parcentage);
			
			if ( parcentage >=33 & parcentage <=45)
			{System.out.println("Overall Result:Third Position");
			
			}
			else if ( parcentage >=45& parcentage <60)
			{
				System.out.println("Overall Result:Second Position");
				
			}
			else 
			{
                System.out.println("Overall Result:First Position");
			}
	}
		
		
	}
	
	public static void main(String[] args) {
		
		Parcentage_2return ob = new Parcentage_2return();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Please enter your Father's name");
		String fname= sc.next();
		System.out.println("Enter your collage name");
		String collname= sc.next();
		System.out.println("Enter your roll number");
		long rollno= sc.nextLong();
		System.out.println("Enter Hindi marks ");
		int hindi = sc.nextInt();
		System.out.println("Enter Science marks");
		int science= sc.nextInt();
		System.out.println("Ener English marks");
		int english= sc.nextInt();
		System.out.println("Enter Computer marks");
		int computer= sc.nextInt();
		System.out.println("Enter Maths marks");
		int maths= sc.nextInt();
		ob.marks(name, fname, collname, rollno, hindi, science, english, computer, maths);
		sc.close();
	
		
		
	}

}
