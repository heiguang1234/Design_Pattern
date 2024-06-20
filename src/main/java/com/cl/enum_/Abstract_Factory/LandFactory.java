package com.cl.enum_.Abstract_Factory;

/**
 * Author:Black Sunshine
 * Date:2024/6/19 16:35
 */
public class LandFactory implements NatureFactory{
    public Animal createAnimal() {
        return new LandAnimal();
    }

    public Plant createPlant() {
        return new LandPlant();
    }
}
