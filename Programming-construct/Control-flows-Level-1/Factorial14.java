import java.util.*;
class Factorial14
{ 
    public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<0)
		{ 
	        System.out.println(" not a factorial number");
	        return;
		}
		long fact=1;
		int i=1;
	    while(i<=n)
	    {
		    fact*=i;
			i++;
		}
			System.out.println("Factorial:"+fact);
	}
}

	