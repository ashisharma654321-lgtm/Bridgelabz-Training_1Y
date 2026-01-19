import java.util.*;
class Converter{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the kilometers:");
	double kilometers=sc.nextDouble();
	double miles=kilometers*1.6;
	System.out.println(miles);
	}
}