package com.company;

public class Bicycle extends Vehicul {
    @Override
    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + 5);
        System.out.println("Bicycle: Viteza marita cu 5. Viteza de acum: " + getSpeed());
    }
}