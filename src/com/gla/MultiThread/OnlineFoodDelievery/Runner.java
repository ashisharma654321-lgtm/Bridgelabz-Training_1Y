package com.gla.MultiThread.OnlineFoodDelievery;

public class Runner {
    public static void main(String[] args){
        EconomyDelievery ec=new EconomyDelievery(2,"Gini",7);
        ExpressDelivery ex=new ExpressDelivery(3,"Bilu",8);
        StandardDelivery sd=new StandardDelivery(7,"Kitu",9);

        Thread t1=new Thread(ec);
        Thread t2=new Thread(ex);
        Thread t3=new Thread(sd);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        }
    }
