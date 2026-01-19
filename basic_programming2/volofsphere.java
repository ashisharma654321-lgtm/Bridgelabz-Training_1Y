import java.util.*;
class volofsphere
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius:");
	int radius=sc.nextInt();
	double volume=4/3*3.14*radius*radius*radius;
	System.out.println(volume);
   }
}