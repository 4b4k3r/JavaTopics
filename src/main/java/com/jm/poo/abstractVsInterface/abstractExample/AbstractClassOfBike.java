package com.jm.poo.abstractVsInterface.abstractExample;

/*
 * When should use abstract classes ?
 * When you need an object to do certain things
 * You can do many things in many ways
 *
 * In technical words:
 * When you require that one or more objects of
 * the same nature behave in different ways without
 * being forced to behave the same as the parent class (abstract)
 * */

//You can extend a single class regardless of whether it is abstract
//Needless to say you have to define the abstract reserved keyword?
public abstract class AbstractClassOfBike {
    protected Integer wheels;
    protected String brakes;
    protected String chassis;
    protected String lights;
    protected String name;

    //Can not have constructor like any other class
    //If you define a constructor you mush define constructor in son class and then call
    // + to father constructor with super keyword
    //If we have a constructor without parameters (regardless of whether we have
    // + constructors with parameters) we are not obliged to create the constructor in the child class
    //If we do not define a constructor in the parent class by default there is a constructor without parameters
    //If we only have constructors with parameters we are forced to create at least one constructor
    // + in the child class and invoke any parent constructor (with a structure like this the default
    // + constructor without parameters will not be available)
    public AbstractClassOfBike() {
        this.wheels = 2;
        this.brakes = "rubber";
        this.chassis = "aluminum";
        this.lights = "led";
        this.name = "bike";
    }

    //You can many constructors as you wont like another class
    public AbstractClassOfBike(Integer wheels, String brakes, String chassis, String lights, String name) {
        this.wheels = wheels;
        this.brakes = brakes;
        this.chassis = chassis;
        this.lights = lights;
        this.name = name;
    }

    //Abstract method never can be private
    //When you define an abstract method you mush override it/them in child class
    //Abstract method not have body
    //Abstract met  hod could have parameters or not
    //By now you should understand that abstract means that an object maintains
    // + attributes that make it belong to the same group but is not obliged to
    // + behave in the same way as the others, but the concept of the original
    // + (abstract) class is maintained through the heritage
    abstract void printFeatures();

    protected void printName() {
        System.out.println("Im a " + name);
    }
}
