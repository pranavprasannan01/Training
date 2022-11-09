package exception.example;
import java.util.Scanner;
public class Example2 {
	public void get() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=s.nextInt();
		System.out.println("Enter the second number : ");
		int b=s.nextInt();
		try
		{
			if (a>b) {
			throw new ArithmeticException();
		}
			else {
				System.out.println(b);
			}
		}
		catch(ArithmeticException e)  {
			System.out.println(a+" is greater than "+b);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("statement outside finally");
	}

	public static void main(String[] args) throws Exception {
		Example2 obj=new Example2();
		obj.get();
		

	}

}
