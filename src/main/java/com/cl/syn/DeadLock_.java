package com.cl.syn;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;
import sun.font.DelegatingShape;

public class DeadLock_ {
    public static void main(String[] args) {
        //模拟死锁现象
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
        deadLockDemo1.setName("A");
        deadLockDemo2.setName("B");
        deadLockDemo1.start();
        deadLockDemo2.start();
    }
}


class DeadLockDemo extends Thread{
    //静态这里保证锁的是同一个对象
    static Object o1=new Object();
    static Object o2=new Object();
    private boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }
/**
 * 1. 如果flag为T 线程a就会先得到对象锁o1，然后尝试获取o2
 * 2. 线程A 得不到就会Blocked
 * 3. 如果Flag为F 线程B就会得到o2 然后尝试获取o1
 * 4 得不到 B就会Blocked*/
    @Override
    public void run() {
        if (flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
            }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }
        }
    }
}