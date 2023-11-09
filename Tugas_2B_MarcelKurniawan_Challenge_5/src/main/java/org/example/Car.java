package org.example;

class Car extends Vehicle {
    private int numberOfDoors;
    private int fuelCapacity;
    private String transmissionType;
    private String color;

    public Car(int numberOfDoors, int fuelCapacity, String transmissionType, String color) {
        super(4); // A car typically has 4 wheels
        this.numberOfDoors = numberOfDoors;
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
        this.color = color;
    }

    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Wheels: " + super.wheels);
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Color: " + color);
    }

    @Override
    public void start() {
        System.out.println("Car engine started.");
        super.start();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}