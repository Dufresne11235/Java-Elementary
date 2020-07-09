package jelesson4;

import java.text.DecimalFormat;

enum Town {
    KRYVE(180), ZHASHKIV(160), KYIV(150);
    private int distance;

    Town(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}

public class Homework4 {
    public static void main(String[] args) {
        Car car1 = new Car(40, 60, 7);
        car1.checkTank();
        car1.pitStop();
        car1.checkPath(490, 30);
        car1.drive(Town.KRYVE);
        car1.pitStop();
        car1.drive(Town.ZHASHKIV);
        car1.pitStop();
        car1.drive(Town.KYIV);
        car1.checkTank();
    }
}

class Car {
    double tankCurrent = 0;
    double tankMax = 0;
    double fuelPer100 = 0;
    DecimalFormat df = new DecimalFormat("0.#");

    public Car(double tankCurrent, double tankMax, double fuelPer100) {
        this.tankCurrent = tankCurrent;
        this.tankMax = tankMax;
        this.fuelPer100 = fuelPer100;
    }

    public void checkTank() {
        System.out.println("Tank current/max: " + tankCurrent + "/" + tankMax);
    }

    public void checkPath(int distance, double price) {
        double fuelNeeded = distance * fuelPer100 / 100;
        System.out.println("Fuel needed: " + fuelNeeded + ", " + df.format(tankCurrent - fuelNeeded) + " will be left");
        DecimalFormat cf = new DecimalFormat("0.00");
        System.out.println("The trip will cost " + cf.format(fuelNeeded * price) + " UAH");
    }

    public double pitStop() {
        double refuel = tankMax - tankCurrent;
        tankCurrent += refuel;

        System.out.println(df.format(refuel) + " fuel refilled");
        return refuel;
    }

    public double drive(Town town) {
        double fuelSpent = town.getDistance() * fuelPer100 / 100;
        tankCurrent -= fuelSpent;
        System.out.println(town.getDistance() + " km to " + town.name() + " passed, " + fuelSpent + " fuel spent");
        return fuelSpent;
    }
}
