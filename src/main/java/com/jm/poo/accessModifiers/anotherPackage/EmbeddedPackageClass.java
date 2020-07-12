package com.jm.poo.accessModifiers.anotherPackage;

import com.jm.poo.accessModifiers.OwnerClass;

public class EmbeddedPackageClass extends OwnerClass {
    private static final String PRINT_EMBEDDED_PACKAGE_CLASS = "EmbeddedPackageClass can access to : ['%s', '%s']\n";
    private static final String PRINT_EMBEDDED_CLASS_OEP = "EmbeddedClassOfEmbeddedPackage can access to : ['%s']\n";

    public static void run() {
        EmbeddedPackageClass embeddedPackageClass = new EmbeddedPackageClass();
        System.out.format(PRINT_EMBEDDED_PACKAGE_CLASS, embeddedPackageClass.publicModifier, embeddedPackageClass.protectedModifier);
    }

    public static class EmbeddedClassOfEmbeddedPackage {
        public static void run() {
            OwnerClass ownerClass = new OwnerClass();
            System.out.format(PRINT_EMBEDDED_CLASS_OEP, ownerClass.publicModifier);
        }
    }
}
