package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }
    public int getDoors() {
        return this.doors;
    }

    public int getGears() {
        return this.gears;
    }

    public int getWheels() {
        return this.wheels;
    }

    public boolean isManual() {
        return this.isManual;
    }

    public String getType() {
        return this.type;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("ChangeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        super.move(newSpeed, newDirection);
        System.out.println("ChangeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    // Getter method for currentSpeed
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }
}
