import java.util.Scanner;
class Square
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the square:");
	  int square=sc.nextInt();
	  int perimeter=4*square;
	  System.out.println(perimeter);
   }
}