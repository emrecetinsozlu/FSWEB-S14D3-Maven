package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double getAvgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double getAvgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.getAvgKmPerLitre = getAvgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return getAvgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting HybridCar");
    }
    @Override
    public void drive(){
        System.out.println("Driving HybridCar");
        runEngine();
    }
}
