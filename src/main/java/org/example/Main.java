package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        Car car2 = new Holden(6, "Commodore");
        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        CarSkeleton gasCar = new GasPoweredCar("GasCar", "Efficient gas-powered car", 15.0, 4);
        CarSkeleton electricCar = new ElectricCar("ElectricCar", "Eco-friendly electric car", 300.0, 75);
        CarSkeleton hybridCar = new HybridCar("HybridCar", "Versatile hybrid car", 20.0, 50, 4);

        System.out.println("Testing car: " + gasCar.getName());
        System.out.println("Description: " + gasCar.getDescription());
        gasCar.startEngine();
        gasCar.drive();
        System.out.println();

        System.out.println("Testing car: " + electricCar.getName());
        System.out.println("Description: " + electricCar.getDescription());
        electricCar.startEngine();
        electricCar.drive();
        System.out.println();


        System.out.println("Testing car: " + hybridCar.getName());
        System.out.println("Description: " + hybridCar.getDescription());
        hybridCar.startEngine();
        hybridCar.drive();
        System.out.println();
    }
}