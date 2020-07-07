package jelesson4;

public class Car {
    double tankCurrent = 0;
    double tankMax = 0;
    double fuelPer100 = 0;

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
        System.out.println("Fuel needed: " + fuelNeeded + ", " + (tankCurrent - fuelNeeded) + " will be left");
        System.out.println("The trip will cost " + fuelNeeded * price + " UAH");
    }

    public double pitStop() {
        double refuel = tankMax - tankCurrent;
        tankCurrent += refuel;
        System.out.println(refuel + " fuel refilled");
        return refuel;
    }

    public double drive(int distance) {
        double fuelSpent = distance * fuelPer100 / 100;
        tankCurrent -= fuelSpent;
        System.out.println(distance + " km passed, " + fuelSpent + " fuel spent");
        return fuelSpent;
    }
}

class CarDrive {
    public static void main(String[] args) {
        int Kryve = 180;
        int Zhashkiv = 160;
        int Kyiv = 150;

        Car car1 = new Car(40, 60, 7);
        car1.checkTank();
        car1.pitStop();
        car1.checkPath(490, 30);
        car1.drive(Kryve);
        car1.pitStop();
        car1.drive(Zhashkiv);
        car1.pitStop();
        car1.drive(Kyiv);
        car1.checkTank();
    }
}