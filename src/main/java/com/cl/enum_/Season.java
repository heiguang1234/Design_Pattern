package com.cl.enum_;

import org.junit.Test;

/**
 * Author:Black Sunshine
 * Date:2024/6/19 15:22
 */
public class Season {
    private String name;
    private String desc;
    public static final Season SPRING=new Season("春天","温暖");
    public static final Season SUMMER=new Season("夏天","炎热");
    public static final Season AUTUMN=new Season("秋天","凉爽");
    public static final Season WINTER=new Season("冬天","寒冷");
    /**
     * 将构造器私有化 目的防止直接new
     * 去掉set方法 防止属性被修改
     * 在Season内部，直接创建固定的对象*/

    private Season(String name, String desc) {
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

