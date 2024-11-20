package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(boolean engine, int cylinders, String name, int wheels) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        return Objects.equals(((Car) car).name, name) && ((Car) car).cylinders == cylinders;

    }
}
