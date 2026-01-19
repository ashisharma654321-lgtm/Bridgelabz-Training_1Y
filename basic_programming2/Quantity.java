import java.util.*;
class Quantity
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unitPrice:");
		int unitPrice=sc.nextInt();
		System.out.println("Enter the quantity:");
		int quantity=sc.nextInt();
		int totalPrice=unitPrice*quantity;
		System.out.println(totalPrice);
	}
}