package com.gla.ExceptionHandling;

import java.util.*;
public class UncheckedException {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter the num1");
            int num1=sc.nextInt();
            System.out.println("enter the num2");
            int num2=sc.nextInt();
            System.out.println("the division of both number is :-");
            int div=num1/num2;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Program Is Working");
        }
    }
}