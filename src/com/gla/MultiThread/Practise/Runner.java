package com.gla.MultiThread.Practise;

public class Runner {
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread t=new Thread(t1);
        Thread t3=new Thread(t2);
        t.start();
    }
}
