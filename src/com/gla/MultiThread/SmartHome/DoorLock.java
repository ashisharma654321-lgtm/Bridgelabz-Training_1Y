package com.gla.MultiThread.SmartHome;

public class DoorLock extends Thread{
    @Override
    public void run() {
        for(int i=0;i<6;i++){
            System.out.println("Monitoring Door Lock Number:"+i);
            try{
                Thread.sleep(6000);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
