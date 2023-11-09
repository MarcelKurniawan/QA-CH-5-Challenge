package org.example;

class SuzukiKatana extends Car {
    public SuzukiKatana() {
        super(4, 40, "Manual", "Red");
    }

    // Additional attributes and methods specific to Suzuki Katana

    @Override
    public void displayCarInfo() {
        System.out.println("Car Model: Suzuki Katana");
        super.displayCarInfo();
    }
}