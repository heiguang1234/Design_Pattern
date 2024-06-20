package com.cl.enum_;

import org.junit.Test;

import javax.swing.*;

/**
 * Author:Black Sunshine
 * Date:2024/6/19 15:29
 */
public class main {
    @Test
    public void test(){
        System.out.println(Season.SPRING);
        System.out.println(Season.AUTUMN);
    }
}

enum enum_Season {
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    private String name;
    private String desc;

    /**
     * 如果使用enum代替枚举类
     * eum代替class
     * 直接用SPRING("春天","温暖")
     * 有多个常量直接逗号隔开
     * 要求将常量对象写在前面*/

    private enum_Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}