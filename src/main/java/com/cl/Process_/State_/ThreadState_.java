package com.cl.Process_.State_;

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName()+"状态"+t.getState());
        t.start();
        while (t.getState()!=Thread.State.TERMINATED){
            System.out.println("当前线程的状态是"+t.getState());
            Thread.sleep(500);
        }

    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("线程在运行");
            }
            break;
        }

    }
}