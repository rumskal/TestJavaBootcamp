package org.example;

public class Weapon implements IShootable{

    private String brand;
    //how did we know line 7 it is brand?
    public Weapon(String brand){
        this.brand=brand;
    }
//when do we know when to include correct return
    public String shoot(){
        return shoot;
    }

    @Override
    public String toString() {
        return brand;
    }
}
