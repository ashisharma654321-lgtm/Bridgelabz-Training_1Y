package com.gla.MultiThread.SmartHome;

public class Runner {
    public static void main(String[] args){
        DoorLock d=new DoorLock();
        LightControl l=new LightControl();
        SecurityCamera s=new SecurityCamera();
        TemperSensor t=new TemperSensor();

        d.setPriority(5);
        l.setPriority(5);
        s.setPriority(10);
        t.setPriority(7);

        s.start();
        l.start();
        s.start();
        t.start();
    }
}
