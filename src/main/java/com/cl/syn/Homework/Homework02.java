package com.cl.syn.Homework;

public class Homework02 {
}


class Client01 extends Thread{
    private  static int CreditSum=10000;
    @Override
    public synchronized void run() {
        CreditSum-=1000;
        System.out.println(this.getName()+"取款一次，剩余余额为："+CreditSum);
    }
}

class Client02 extends Thread{
    @Override
    public void run() {
        super.run();
    }
}