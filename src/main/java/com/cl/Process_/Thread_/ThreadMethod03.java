package com.cl.Process_.Thread_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
//        将线程设置成守护线程 当所有工作线程结束，守护线程自动结束
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("宝强在辛苦的工作");
        }
    }
}



class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (;;){
            System.out.println("宋喆与马蓉在疯狂聊天");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}