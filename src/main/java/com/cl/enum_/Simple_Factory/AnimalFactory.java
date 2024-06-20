package com.cl.enum_.Simple_Factory;

/**
 * Author:Black Sunshine
 * Date:2024/6/19 16:07
 */
/*
* 简单工厂类 根据给定的类型实例化相应的动物实例*/
public class AnimalFactory {
    public enum AnimalType {
        DOG,
        CAT
    }

    public static Animal createAnimal(AnimalType type) {
        switch (type) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            default:
                throw new IllegalArgumentException("Invalid animal type: " + type);
        }
    }
}
