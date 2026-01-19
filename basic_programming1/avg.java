import java.util.*;
class Avg
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maths:");
		int maths =sc.nextInt();
		System.out.println("Enter the chem:");
		int chem =sc.nextInt();
		System.out.println("Enter the phy:");
		int phy =sc.nextInt();
		int avg =(maths*chem*phy)/3;
		System.out.println(avg);
	}
}