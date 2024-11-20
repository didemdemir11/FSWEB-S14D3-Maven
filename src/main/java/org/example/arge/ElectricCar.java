package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Electric engine is starting...");
    }
    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": The electric car is driving...");
        runEngine();
    }
    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Electric motor with battery size " + batterySize + " kWh is running...");
    }
}
