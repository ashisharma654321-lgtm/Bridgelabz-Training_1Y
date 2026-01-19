import java.util.*;
class herry
{
   public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the birthyear:");
	   int birthyear=sc.nextInt();
	   System.out.println("Enter the currentyear:");
	   int currentyear=sc.nextInt();
	   int age=currentyear-birthyear;
	   System.out.println(age);
   }
}