package com.cl.enum_.Simple_Factory;

/**
 * Author:Black Sunshine
 * Date:2024/6/19 16:09
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = (Dog)AnimalFactory.createAnimal(AnimalFactory.AnimalType.DOG);
        dog.speak();
    }
}
