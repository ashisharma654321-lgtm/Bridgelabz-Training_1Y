import java.util.*;
class area
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println(area);
	}
}