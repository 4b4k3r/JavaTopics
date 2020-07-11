package com.jm.poo.abstractVsInterface;

/*
* When should use interfaces ?
* when you need an object to always conform the same way
* You promise the class to always have the same functionalities
* */

//You can implement as many interfaces as you want or need
//Needless to say you have to define the implements keyword?
//No you cant extend for another class
//You can implement from another interface but the rule change, you must use the extends keyword
public interface InterfaceExample
{
    //By default a attribute is public, static and final
    String UTF_8 = "UTF-8";

    //A method with body must be static
    //By default is public
    //Cant be override
    static void sayHello()
    {
        System.out.println("Hello, i suppose...");
    }

    //A method without body should not be static
    //By default is public
    //You are forced to override them
    void doSomething();
    Integer doSomethingElse();
}
