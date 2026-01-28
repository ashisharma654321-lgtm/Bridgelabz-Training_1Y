import java.util.*;
class SumofNum10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num;
		while(true)
		{
			System.out.println("Enter numbers to sum(enter 0 or negative number to stop):");
			num=sc.nextInt();
			if(num<=0)
			{
				break;
			}
			sum+=num;
		}
		System.out.println("Sum of positive numbers entered:"+sum);
	}
}