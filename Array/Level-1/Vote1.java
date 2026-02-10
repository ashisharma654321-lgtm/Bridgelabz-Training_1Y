import java.util.*;
public class Vote1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
		System.out.println("enter the 5 number ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

        for(int i = 0; i < arr.length; i++) {
            int a = arr[i];
			if(a>0){
				System.out.println("its positive number");
				if(a%2==0){
					System.out.println("its even number");
				}else{
					System.out.println("its odd number");
				}
			}else if(a<0){
				System.out.println("its a negative number");
			}else if(a==0){
				System.out.println("its zero");
			}
		}
		int first=arr[0];
		int last=arr[arr.length-1];
		if(first == last){
			System.out.println("first and last element are equal");
		}else if(first>last){
			System.out.println("first element is greater than last element");
		}else {
			System.out.println("first element is less than last element");
		}
	}
}