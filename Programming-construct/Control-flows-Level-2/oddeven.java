import java.util.*;
class oddeven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%2==0)
			{
				System.out.println(i+"is even");
			}
			else
			{
				System.out.println(i+"is odd");
			}
		}
	}
}
			