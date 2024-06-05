package org.example;

public class LaserGun extends Weapon{

    //this constructor for this class. since it is extended by Weapon,
    // we are using same STring name brand and super becos from main parent.
    public  LaserGun(String brand){
     super (brand);
    }

    @Override
    public String shoot() {
        return "Zing!! " +  super.shoot();
    }
}
