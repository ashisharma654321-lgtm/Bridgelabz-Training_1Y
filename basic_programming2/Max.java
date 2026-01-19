import java.util.*;
class Max
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=sc.nextInt();
		int max=(n*(n-1))/2;
		System.out.println(max);
	}
}