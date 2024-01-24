import java.util.Scanner;
public class demo
{
	public static void main(String[] args)
	{
		abst x = new class1();
		abst y = new class2();
	
		Scanner s = new Scanner(System.in);
		System.out.println("Please input x or y, input of x prints 1, input of y prints 2");	
		String z = s.nextLine();
		
		if(z.charAt(0) == 'x')
			x.m1();
		
		else if(z.charAt(0) == 'y')
			y.m1();
		
		else
			System.out.println("Invalid choice");
	}
}	
