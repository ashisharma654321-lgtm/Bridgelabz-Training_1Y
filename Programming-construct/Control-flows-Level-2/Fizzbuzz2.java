import java.util.*;
class Fizzbuzz2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%3==0)
			{
				System.out.println("fizz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.println("fizzbuzz");
			}
			   i++;
		}
	}
}