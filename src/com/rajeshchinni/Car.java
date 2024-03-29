package com.rajeshchinni;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

//    public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual, int currentGear) {
//        super(name, size, currentVelocity, currentDirection);
//        this.wheels = wheels;
//        this.doors = doors;
//        this.gears = gears;
//        this.isManual = isManual;
//        this.currentGear = currentGear;
//    }

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    //method
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() called and changed the gear to " + this.currentGear + " gear.");
    }

    //method
    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() is called and velocity is " + speed + " direction is " + direction);
        move(speed, direction);
    }

}
