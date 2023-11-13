package com.company;

public abstract class Vehicul {
    private int speed;

    public Vehicul() {
        this.speed = 0;
    }

    public abstract void speedUp();

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }
}

