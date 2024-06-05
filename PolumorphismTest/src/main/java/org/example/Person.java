package org.example;

public class Person {

    private String firstName = " "; // the = gives it a default value
    private String lastName = " ";
    private int age;


    //constructors
    public Person(String firstName, String lastName, int age) {
        // the use of this constructor so that it knows the variable is stored in that class
        this.firstName = firstName;
        this.lastName = lastName;
        //this.age = age;, this was changed to below becos we know age cant be less than zero
        //so we set age in constructor.
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public Person(){

    }


    // a setter just sets the thing you want and normally doesnt have a return type
// can set conditions eg you may not want the age to be less than 0 so it will not set that age
    public void setAge(int newAge) {
        if (newAge >= 0) {

            this.age = newAge;
        }
    }

    //this is constructor overload. from P2 main java we created constructor
    // overload method with just one parameter.
    public Person(String firstName) {
    /* if there is no first or last name it will give the value null if there is
     no default value */
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}



