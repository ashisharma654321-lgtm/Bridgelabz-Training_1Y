import java.util.*;
class Profit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sellingprice:");
		int sellingprice=sc.nextInt();
		System.out.println("Enter the costprice:");
		int costprice=sc.nextInt();
		int profit=sellingprice-costprice;
		int pp=(profit/costprice)*100;
		System.out.println(pp);
	}
}