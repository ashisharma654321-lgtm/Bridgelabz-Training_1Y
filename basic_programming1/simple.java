import java.util.*;
class simple
{
    public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the principle:");
	 int principle=sc.nextInt();
	 System.out.println("Enter the rate:");
	 int rate=sc.nextInt();
	 System.out.println("Enter the time:");
	 int time=sc.nextInt();
	 int si=(principle*rate*time)/100;
	 System.out.println(si);
	 }
}
	 