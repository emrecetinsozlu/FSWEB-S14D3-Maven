package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Car(" + cylinders + " " + name + " " + wheels + " " + engine + ")";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Car)) return false;
        Car car = (Car)o;
        return cylinders == car.cylinders && name == car.name;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ".startEngine");
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate");
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName() + ".brake");
        return "the car is braking";
    }
}
