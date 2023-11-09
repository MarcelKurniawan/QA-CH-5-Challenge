package org.example;

class Vehicle {
    protected int wheels;
    private boolean isMoving;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
        this.isMoving = false;
    }

    public void start() {
        isMoving = true;
        System.out.println("Vehicle is moving.");
    }

    public void stop() {
        isMoving = false;
        System.out.println("Vehicle has stopped.");
    }

    public void turnLeft() {
        if (isMoving) {
            System.out.println("Vehicle is turning left.");
        } else {
            System.out.println("Cannot turn left while stationary.");
        }
    }

    public void turnRight() {
        if (isMoving) {
            System.out.println("Vehicle is turning right.");
        } else {
            System.out.println("Cannot turn right while stationary.");
        }
    }
}