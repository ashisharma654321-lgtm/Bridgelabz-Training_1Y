import java.util.*;
class Factorial15
{ 
    public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<0)
		{ 
	        System.out.println("not a factorial number");
	        return;
		}
		long fact=1;
		for(int i=1;i<=n;i++)
	    {
		    fact*=i;
			i++;
		}
			System.out.println("Factorial:"+fact);
	}
}