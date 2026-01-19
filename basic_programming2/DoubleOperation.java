import java.util.*;
class DoubleOperation{
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the value of a :");
	 double a=sc.nextDouble();
	 System.out.println("Enter the value of b :");
	 double b=sc.nextDouble();
	 System.out.println("Enter the value of c :");
	 double c=sc.nextDouble();
	 double num1=a+b*c;
	 double num2=a*b+c;
	 double num3=c+a/b;
	 double num4=a%b+c;
	 System.out.println(num1);
	 System.out.println(num2);
	 System.out.println(num3);
	 System.out.println(num4);
	}
}