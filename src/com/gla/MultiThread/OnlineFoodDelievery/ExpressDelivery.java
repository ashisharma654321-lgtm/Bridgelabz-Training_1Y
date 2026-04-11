package com.gla.MultiThread.OnlineFoodDelievery;

public class ExpressDelivery extends Order implements Runnable {
    public ExpressDelivery(int ordId,String restName,int dTime){
        super(ordId,restName,dTime);
    }
    @Override
    public void run(){
        try{
            Thread.sleep(dTime*1000);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Order ID: "+ordId+"\nRestaurant namr: "+restName+"\nDelivery time: "+dTime);
    }
}
