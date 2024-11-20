package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Gas engine is starting...");
    }
    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": The gas-powered car is driving...");
        runEngine();
    }
    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Gas engine with " + cylinders + " cylinders is running...");
    }
}
