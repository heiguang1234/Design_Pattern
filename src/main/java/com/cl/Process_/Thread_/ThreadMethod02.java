package com.cl.Process_.Thread_;

/**
 * Author:Black Sunshine
 * Date:2024/6/26 20:11
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        // 子线程开始工作
        t2.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了" + i + "个包子");
            if (i==5){
                System.out.println("这里让自线程插队");
                t2.join();
            }
        }

    }
}


class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程吃了" + i + "个包子");
        }
    }
}