import java.util.*;
class Naturalsum13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("No is natural:");
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			i++;
		}
		int sumFormulae=n*(n+1)/2;
		System.out.println("sum");
		System.out.println("sumFormulae");
		if(sum==sumFormulae)
		{
			System.out.println("Result is correct");
		}
		else
		{
			System.out.println("Result is not correct");
		}
	}
}