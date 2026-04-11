package com.gla.MultiThread.OnlineFoodDelievery;

public class StandardDelivery extends Order implements Runnable{
    public StandardDelivery(int ordId, String restName,int dTime){
        super(ordId, restName, dTime);
    }
    @Override
    public void run() {
        try{
            Thread.sleep(dTime*1000);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Order ID: "+ordId+"\nRestaurant name: "+restName+"\nDelivery time: "+dTime);
    }
}
