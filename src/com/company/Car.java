package com.company;

public class Car extends Vehicul {
    @Override
    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + 10);
        System.out.println("Car: Viteza marita cu 10. Viteza de acum: " + getSpeed());
    }
}
