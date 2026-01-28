import java.util.*;
class youngest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int minAge=sc.nextInt();
		int ageAmar=sc.nextInt();
		int ageAkbar=sc.nextInt();
		int ageAnthony=sc.nextInt();
		if(minAge==ageAmar)
		{
			System.out.println("Youngest friend is Amar:");
		}
		else if(minAge==ageAkbar)
		{
			System.out.println("Youngest friend is Akbar:");
		}
		else
		{
			System.out.println("Youngest friend is Anthony:");
		}
		double maxheight=sc.nextDouble();
		double heightAmar=sc.nextDouble();
		double heightAkbar=sc.nextDouble();
		double heightAnthony=sc.nextDouble();
		if(maxheight==heightAmar)
		{
			System.out.println("Tallest friend is Amar:");
		}
		else if(maxheight==heightAkbar)
		{
			System.out.println("Tallest friend is Akbar:");
		}
		else
		{
			System.out.println("Tallest friend is Anthony:");
		}
	}
}