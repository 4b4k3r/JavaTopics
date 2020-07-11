package com.jm.poo.accessModifiers;

import com.jm.poo.accessModifiers.anotherPackage.EmbeddedPackageClass;

import java.util.Arrays;

public class PackageClass {
    private static final String PRINT = "|%-9s|%-10s|%-13s|%-14s|%-22s|\n";
    public static void main(String[] args) {
        UpperClass upperClass = new UpperClass();
        System.out.println("Yes, i PackageClass can access to public " + upperClass.publicModifier);
        System.out.println("Yes, i PackageClass can access to public " + upperClass.defaultModifier);
        System.out.println("Yes, i PackageClass can access to public " + upperClass.protectedModifier);

        UpperClass.run();
        EmbeddedPackageClass.run();
        EmbeddedPackageClass.EmbeddedClassOfEmbeddedPackage.run();

        System.out.println("How it works ?\n");
        System.out.format(PRINT, "Modifier", "Same class", "Same package", "Other package", "Other package subclass");
        System.out.format(PRINT, "public", "yes","yes","yes","yes");
        System.out.format(PRINT, "default", "yes","yes","yes","");
        System.out.format(PRINT, "protected", "yes","yes","","");
        System.out.format(PRINT, "private", "yes","","","");
    }

    static class EmbeddedClass {
        public static void run() {
            UpperClass upperClass = new UpperClass();
            System.out.println("Yes, i PackageClass can access to public " + upperClass.publicModifier);
            System.out.println("Yes, i PackageClass can access to public " + upperClass.defaultModifier);
            System.out.println("Yes, i PackageClass can access to public " + upperClass.protectedModifier);
        }
    }
}
