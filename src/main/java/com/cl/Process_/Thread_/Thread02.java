package com.cl.Process_.Thread_;

/**
 * Author:Black Sunshine
 * Date:2024/6/24 21:26
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();


    }
}


class Dog implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("小狗汪汪叫");
        }
    }
}