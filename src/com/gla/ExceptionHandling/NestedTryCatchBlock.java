package com.gla.ExceptionHandling;

import java.util.*;
public class NestedTryCatchBlock {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the index: ");
        int index=sc.nextInt();
        System.out.println("enter the divison");
        int div=sc.nextInt();
        try{
            int value=arr[index];
            try{
                int result=value/div;
                System.out.println("result:-"+result);
            }catch (ArithmeticException e){
                System.out.println("cannot divide by zero");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index");
        }

    }
}