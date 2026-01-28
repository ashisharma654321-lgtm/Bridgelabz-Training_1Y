import java.util.*;
class Greatestfac
{ 
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=1;
		for(int i=a-1;i>=1;i--)
		{
			if(a%i==0)
			{
				n=i;
				break;
			}
		}
		System.out.println("greatest factor besides itself"+a);
	}
}