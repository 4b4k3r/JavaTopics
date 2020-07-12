package com.jm.poo.abstractVsInterface.interfaceExample;

/*
 * When should use interfaces ?
 * when you need an object to always conform the same way
 * You promise the class to always have the same functionalities
 * */

import java.util.StringJoiner;

//You can implement as many interfaces as you want or need
//Needless to say you have to define the implements keyword?
//No you cant extend for another class
//You can implement from another interface but the rule change, you must use the extends keyword
public interface InterfaceOfCompactDisk {
    //By default a attribute is public, static and final
    Integer internalRatio = 25; //mm
    Integer externalRatio = 60; //mm
    Integer centerHoleDiameter = 15; //mm
    Integer thickness = 15; //mm
    Double distanceBetweenTracks = 1.6; //'um' thousandth part of a millimeter 1000/1mm

    //A method with body must be static
    //By default is public
    //Cant be override
    //With or without body the declared methods can return or not a value
    static String printDescription() {
        StringJoiner sj = new StringJoiner("\n");
        sj.add("internal ratio is " + internalRatio + " millimeters");
        sj.add("external ratio is " + externalRatio + " millimeters");
        sj.add("center hole diameter is " + centerHoleDiameter + " millimeters");
        sj.add("thickness is " + thickness + " millimeters");
        sj.add("distance between tracks is " + distanceBetweenTracks + " micrometer");
        return sj.toString();
    }

    //A method without body should not be static
    //By default is public
    //You are forced to override them
    Integer getDiameter();
    String getType();
}
