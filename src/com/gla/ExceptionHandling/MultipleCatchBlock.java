package com.gla.ExceptionHandling;

import java.util.*;
public class MultipleCatchBlock {
    public static void main(String[]args){
        int[]array={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index:-");
        int index=sc.nextInt();
        try{
            int value = array[index];
            System.out.println("VALUE "+value);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:- index is out of range");

        }catch(NullPointerException f){
            System.out.println("Error:- Array is null");
        }

    }

}
