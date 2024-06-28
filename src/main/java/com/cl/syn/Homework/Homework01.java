package com.cl.syn.Homework;


import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        //线程通知的方式
//        t1.start();
//        t2.start();
        //守护线程方式
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}



class T1 extends Thread{
    private boolean loop=true;
    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random()*100+1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class T2 extends Thread{
    private Scanner scanner=new Scanner(System.in);
    private T1 t;

    public T2(T1 t) {//构造器中直接传入一个a对象
        this.t = t;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("请输入：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key =='Q'){
                //以通知的方式结束线程1
                t.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }
    }
}

class T3 extends Thread{
    private Scanner scanner=new Scanner(System.in);
    @Override
    public void run() {
        while(true){
            System.out.println("请输入：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key =='Q'){
                //以通知的方式结束线程1
                System.out.println("b线程退出");
                break;
            }
        }
    }
}