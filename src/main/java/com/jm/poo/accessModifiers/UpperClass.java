package com.jm.poo.accessModifiers;

public class UpperClass
{
    public UpperClass()
    {
        defaultModifier = "default modifier value";
        publicModifier = "public modifier value";
        privateModifier = "private modifier value";
        protectedModifier = "protected modifier value";
    }

    String defaultModifier;
    public String publicModifier;
    private String privateModifier;
    protected String protectedModifier;

    public static void run()
    {
        UpperClass upperClass = new UpperClass();
        System.out.println("Yes, i ClassOwner can access to default " + upperClass.defaultModifier);
        System.out.println("Yes, i ClassOwner can access to public " + upperClass.publicModifier);
        System.out.println("Yes, i ClassOwner can access to private " + upperClass.privateModifier);
        System.out.println("Yes, i ClassOwner can access to protected " + upperClass.protectedModifier);
    }
}
