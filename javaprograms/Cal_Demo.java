package javaprograms;

public class Cal_Demo {
	
	float a,b,c;
	public void add()
	{
		a=50;
		b=40;
		c=a+b;
		System.out.println(c);
	}
	
	public void sub()
	{
		a=90;
		b=10;
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		a=10;
		b=30;
		c=a*b;
		System.out.println(c);
	}
	
	public void div()
	{
		a=40;
		b=3;
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Cal_Demo ob= new Cal_Demo();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}
