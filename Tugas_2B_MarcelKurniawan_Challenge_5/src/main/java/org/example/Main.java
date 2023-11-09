package org.example;

public class Main {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        jazz.displayCarInfo();
        jazz.start();
        jazz.turnLeft();

        System.out.println();

        fortuner.displayCarInfo();
        fortuner.start();
        fortuner.turnRight();

        System.out.println();

        katana.displayCarInfo();
        katana.start();
        katana.stop();
    }
}