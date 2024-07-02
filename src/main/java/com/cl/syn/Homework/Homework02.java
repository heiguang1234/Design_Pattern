package com.cl.syn.Homework;

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMLeaf;
import org.junit.internal.runners.statements.RunAfters;

public class Homework02 {
    public static void main(String[] args) {
        Client01 client01 = new Client01();
        new Thread(client01).start();
        new Thread(client01).start();


    }
}


class Client01 implements Runnable {
    private int CreditSum = 10000;
    private static void  m1(){
        synchronized (Client01.class){
            System.out.println("m1");
        }
    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (CreditSum <= 0) {
                    System.out.println("余额不足");
                    break;
                }
                CreditSum-=1000;
                System.out.println(Thread.currentThread().getName()+"取款一次，剩余："+CreditSum);
            }
        }
    }
}
