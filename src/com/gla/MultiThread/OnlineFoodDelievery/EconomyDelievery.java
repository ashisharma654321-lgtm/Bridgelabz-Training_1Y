package com.gla.MultiThread.OnlineFoodDelievery;

public class EconomyDelievery extends Order implements Runnable{
    public EconomyDelievery(int ordId, String restName, int dTime){
        super(ordId,restName,dTime);
    }
    @Override
    public void run(){
        try{
            Thread.sleep(dTime*1000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Order Id: "+ordId+"\nRestaurant name: "+restName+" \nDelivery time: "+dTime);
    }
}
