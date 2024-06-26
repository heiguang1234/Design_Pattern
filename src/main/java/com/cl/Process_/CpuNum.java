package com.cl.Process_;

/**
 * Author:Black Sunshine
 * Date:2024/6/24 15:54
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println("cpu核心数："+i);


    }
}
