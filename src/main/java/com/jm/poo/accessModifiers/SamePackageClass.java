package com.jm.poo.accessModifiers;

import com.jm.poo.accessModifiers.anotherPackage.EmbeddedPackageClass;

public class SamePackageClass {
    private static final String PRINT_TABLE = "|%-9s|%-10s|%-13s|%-14s|%-22s|\n";
    private static final String PRINT_PACKAGE_CLASS = "SamePackageClass can access to : ['%s', '%s', '%s']\n";
    private static final String PRINT_PACKAGE_EMBEDDED_CLASS = "SamePackageEmbeddedClass can access to : ['%s', '%s', '%s']\n";

    public static void main(String[] args) {
        OwnerClass ownerClass = new OwnerClass();

        OwnerClass.run();
        System.out.format(PRINT_PACKAGE_CLASS, ownerClass.publicModifier, ownerClass.defaultModifier, ownerClass.protectedModifier);
        SamePackageEmbeddedClass.run();
        EmbeddedPackageClass.run();
        EmbeddedPackageClass.EmbeddedClassOfEmbeddedPackage.run();

        System.out.println("\nHow it works ?\n");
        System.out.format(PRINT_TABLE, "Modifier", "Same class", "Same package", "Other package", "Other package subclass");
        System.out.format(PRINT_TABLE, "public", "yes", "yes", "yes", "yes");
        System.out.format(PRINT_TABLE, "default", "yes", "yes", "yes", "");
        System.out.format(PRINT_TABLE, "protected", "yes", "yes", "", "");
        System.out.format(PRINT_TABLE, "private", "yes", "", "", "");
    }

    public static class SamePackageEmbeddedClass {
        public static void run() {
            OwnerClass ownerClass = new OwnerClass();
            System.out.format(PRINT_PACKAGE_EMBEDDED_CLASS, ownerClass.publicModifier, ownerClass.defaultModifier, ownerClass.protectedModifier);
        }
    }
}
