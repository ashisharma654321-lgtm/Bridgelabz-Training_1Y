 import java.util.*;
 class volume
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius:");
	  int radius=sc.nextInt();
	  System.out.println("Enter the height:");
	  int height=sc.nextInt();
	  double vol=3.14*radius*radius*height;
	  System.out.println(vol);
   }
}