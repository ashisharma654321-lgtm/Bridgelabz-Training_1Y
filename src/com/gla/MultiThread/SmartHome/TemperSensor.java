package com.gla.MultiThread.SmartHome;

public class TemperSensor extends Thread{
    @Override
    public void run() {
        for(int i=0;i<6;i++){
            System.out.println("Temperature: "+(28+i));
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
