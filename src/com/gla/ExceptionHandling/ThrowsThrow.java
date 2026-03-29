package com.gla.ExceptionHandling;

import java.util.Scanner;

public class ThrowsThrow{
    public static double calculateInterest(double amount ,double rate,int years)
            throws IllegalAccessException{
        if(amount<0||rate<0){
            throw new IllegalAccessException("Amount and rate must be positive");
        }
        return (amount*rate*years)/100;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        double amount=sc.nextDouble();
        System.out.println("enter the rate");
        double rate=sc.nextDouble();
        System.out.println("enter the years");
        int years=sc.nextInt();
        try{
            double interest=calculateInterest(amount,rate,years);
            System.out.println("interest:-"+interest);

        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println("invalid imput");
        }
    }
}
