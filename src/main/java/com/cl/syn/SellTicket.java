package com.cl.syn;

public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        new Thread(sellTicket01).start();//第一个线程
        new Thread(sellTicket01).start();//第二个线程
        new Thread(sellTicket01).start();//第三个线程
    }
}


//实现接口方式，使用syn 实现线程同步
class SellTicket01 implements Runnable {
    private static int ticketNum = 100;
    private boolean loop=true ;

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    public synchronized void sell() {//同步方法，在同一时刻，只能有一个线程来执行sell方法2
        if (ticketNum <= 0) {
            System.out.println("售票结束。。。");
            loop=false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("窗口" + Thread.currentThread().getName() + "剩余票数=" +
                +(--ticketNum));
    }

}