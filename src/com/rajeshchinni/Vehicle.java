package com.rajeshchinni;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

//    public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
//        this.name = name;
//        this.size = size;
//        this.currentVelocity = currentVelocity;
//        this.currentDirection = currentDirection;
//    }

        public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0; //manually done
        this.currentDirection = 0; //manually done
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    //method
    public void steer(int direction){
        this.currentDirection = this.currentDirection + direction;
        System.out.println("Vehicle.steer() called and steering at " + this.currentDirection + " degrees. ");
    }

    //method
    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move() called and moving at " + this.currentVelocity + " in direction " + this.currentDirection);
    }

    //method
    public void stop(){
        this.currentVelocity = 0;
    }

}
