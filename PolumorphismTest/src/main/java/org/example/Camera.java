package org.example;

public class Camera implements IShootable {
    private String brand;

    //constructor
    public Camera(String brand) {
        this.brand = brand;
    }
// here by default you get return null, but changed to tosting. why?
    @Override
    public String shoot() {
        return toString();
    }

    @Override
    public String toString() {
        return "is shooting a Camera" + brand;
    }
}


