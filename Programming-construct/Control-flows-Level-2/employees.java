import java.util.*;
class employees
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
		double yos=sc.nextDouble();
		double bonus=sc.nextDouble();
		bonus=(sal*0.1);
		if(yos>5)
		{
			System.out.println("You will get a bonus of 5%:");
		}
		else
		{
			System.out.println("You will not get a bonus of 5%:");
		}
	}
}