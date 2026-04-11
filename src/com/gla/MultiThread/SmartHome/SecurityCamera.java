package com.gla.MultiThread.SmartHome;

public class SecurityCamera extends Thread{
    @Override
    public void run(){
      for (int i=0;i<6;i++) {
          System.out.println("Camera Recording no. "+i);
          try{
              Thread.sleep(3000);
          } catch(InterruptedException e){
              throw new RuntimeException(e);
          }
    }
    }
}
