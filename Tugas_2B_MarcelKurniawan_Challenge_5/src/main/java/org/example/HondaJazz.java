package org.example;

class HondaJazz extends Car {
    public HondaJazz() {
        super(4, 20, "Automatic", "Black");
    }

    // Additional attributes and methods specific to Honda Jazz
    @Override
    public void displayCarInfo() {
        System.out.println("Car Model: Honda Jazz");
        super.displayCarInfo();
    }
}