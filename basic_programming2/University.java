import java.util.*;
class University
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fee:");
		int fee=sc.nextInt();
		System.out.println("Enter the dis:");
		int dis=sc.nextInt();
		int discount=(fee*dis)/100;
		System.out.println(discount);
	}
}