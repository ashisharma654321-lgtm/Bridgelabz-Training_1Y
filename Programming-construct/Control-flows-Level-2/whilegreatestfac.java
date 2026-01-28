import java.util.*;
class whilegreatestfac
{
    public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int i=n-1;
	  int greatestfac=1;
	  while(i>=1)
	  {
	     if(n%i==0)
		 {
		     greatestfac=i;
			 break;
		 }
		 i--;
	  }
	  System.out.println("Greatest Fac "+ greatestfac);
	}
}