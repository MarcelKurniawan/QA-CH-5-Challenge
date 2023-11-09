package org.example;

class ToyotaFortuner extends Car {
    public ToyotaFortuner() {
        super(4,65, "Manual", "Blue");
    }

    @Override
    public void displayCarInfo() {
        System.out.println("Car Model: Toyota Fortuner");
        super.displayCarInfo();
    }
}
