package javaprograms;

import java.util.Scanner;

public class Marksheet {
	
	String  name, fname, collname ;
	long  rollno;
	float parcentage, total;
	int hindi, science, english, computer, maths;
	
	public void result()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name");
		name= sc.next();
		System.out.println("Please enter your Father's name");
		fname= sc.next();
		System.out.println("Enter your collage name");
		collname= sc.next();
		System.out.println("Enter your roll number");
		rollno= sc.nextLong();
		System.out.println("Enter Hindi marks ");
		hindi = sc.nextInt();
		System.out.println("Enter Science marks");
		science= sc.nextInt();
		System.out.println("Ener English marks");
		english= sc.nextInt();
		System.out.println("Enter Computer marks");
		computer= sc.nextInt();
		System.out.println("Enter Maths marks");
		maths= sc.nextInt();
		
	
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
			
		
	}
	

	public static void main(String[] args) {
		Marksheet ob = new Marksheet();
		ob.result();
	}
}
