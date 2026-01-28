import java.util.*;
class Rocket
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int Counter=sc.nextInt();
		while(Counter>=1)
		{
			System.out.println(Counter);
			Counter--;
		}
		System.out.println("Rocket launch!");
	}
}