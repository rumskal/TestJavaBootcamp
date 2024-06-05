package org.example;

public class Hunter extends Person implements IShootable{
    private IShootable shootable;

    public  Hunter(String fName, String LName, int age, IShootable shootable){
        //since we have already written
        // person first name and other we can use super
        super(fName,LName,age);
        this.shootable = shootable;
    }

    public Hunter(){
    }
    public  String shoot (){

        //return getFullName() + " has taken a photo with their" + shootable;
        return getFullName()+ " " + shootable.shoot();
    }

    @Override
    public String toString() {
        return getFullName() +" is taking a picture with a " + shootable;
    }

    public IShootable getShootable() {
        return shootable;
    }

    public void setShootable(IShootable shootable) {
        this.shootable = shootable;
    }
}
