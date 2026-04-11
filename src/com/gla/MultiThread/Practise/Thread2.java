package com.gla.MultiThread.Practise;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<4;i++){
            System.out.println("Countdown: "+ i + "s");
                    try{
                        Thread.sleep(1000);
                    } catch(Exception e){
                        throw new RuntimeException(e);
                    }
        }
    }
}
