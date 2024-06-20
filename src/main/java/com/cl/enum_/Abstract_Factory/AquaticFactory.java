package com.cl.enum_.Abstract_Factory;

/**
 * Author:Black Sunshine
 * Date:2024/6/19 16:36
 */
public class AquaticFactory implements NatureFactory{
    public Animal createAnimal() {
        return new AquaticAnimal();
    }

    public Plant createPlant() {
        return new AquaticPlant();
    }
}
