package com.jm.poo.accessModifiers;

public class OwnerClass {
    private static final String PRINT_UPPER_CLASS = "OwnerClass can access to : ['%s', '%s', '%s', %s]\n";

    public OwnerClass() {
        defaultModifier = "default modifier value";
        publicModifier = "public modifier value";
        privateModifier = "private modifier value";
        protectedModifier = "protected modifier value";
    }

    String defaultModifier;
    public String publicModifier;
    private String privateModifier;
    protected String protectedModifier;

    public static void run() {
        OwnerClass ownerClass = new OwnerClass();
        System.out.format(PRINT_UPPER_CLASS, ownerClass.defaultModifier, ownerClass.publicModifier, ownerClass.privateModifier, ownerClass.protectedModifier);
    }
}
