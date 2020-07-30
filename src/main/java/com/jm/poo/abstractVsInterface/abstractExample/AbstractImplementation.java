package com.jm.poo.abstractVsInterface.abstractExample;

public class AbstractImplementation extends AbstractClassOfBike {

    public static void main(String[] args) {
        //set by set mode
        AbstractImplementation car = new AbstractImplementation();
        car.lights = "led";
        car.brakes = "disk";
        car.chassis = "metal";
        car.wheels = 4;
        car.name = "car";
        car.printFeatures();

        //Taking default properties
        AbstractImplementation bike = new AbstractImplementation();
        bike.printFeatures();

        //Passing parameters by constructor
        AbstractImplementation trailer = new AbstractImplementation(10, "drum", "aluminum and metal", "warm", "trailer");
        trailer.printFeatures();
    }

    public AbstractImplementation() {
        //When a parent class have a empty constructor super call definition is optional
        super();
    }

    public AbstractImplementation(Integer wheels, String brakes, String chassis, String lights, String name) {
        super(wheels, brakes, chassis, lights, name);
    }

    @Override
    void printFeatures() {
        String format = "\nA %s have %d wheels which use %s brakes, the chassis material is %s and it has some incredible %s lights";
        System.out.format(format, this.name, this.wheels, this.brakes, this.chassis, this.lights);
    }
}
