package com.rajeshchinni;

public class Outlander extends Car {

    private int roadServiceMonths;



        public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    // since outlander is not manual. therefore, the engine automatically changes the gear based on the speed/accelerator.
    // so we have done accelerator method.


    // method
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;  // getCurrentVelocity() is in vehicle class
        if (newVelocity == 0){
            stop();                                     // stop() is in vehicle class
            changeGear(1);                    // changegear() is in Car class
        }else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        }else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else {
            changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());  //changeVelocity() is in Car class
        }
    }


}
