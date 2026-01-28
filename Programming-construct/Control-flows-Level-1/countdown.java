import java.util.*;
class countdown
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int Counter=sc.nextInt();
		for(int i=Counter;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("Rocket launch:");
	}
}