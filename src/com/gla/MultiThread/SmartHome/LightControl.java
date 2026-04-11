package com.gla.MultiThread.SmartHome;

public class LightControl extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Adjusting light brightness to: " + (60 + (i * 2)) + "");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
