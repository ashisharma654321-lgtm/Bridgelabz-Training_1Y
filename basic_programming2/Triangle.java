import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the base:");
	   int base=sc.nextInt();
	   System.out.println("Enter the height:");
	   int height=sc.nextInt();
	   double aot=0.5*base*height;
	   System.out.println(aot);
    }
}