package com.jm.poo.accessModifiers.anotherPackage;

import com.jm.poo.accessModifiers.UpperClass;

public class EmbeddedPackageClass extends UpperClass{
    public static void run() {
        EmbeddedPackageClass upperClass = new EmbeddedPackageClass();
        System.out.println("Yes, i EmbeddedPackageClass can access to public " + upperClass.publicModifier);
        System.out.println("Yes, i EmbeddedPackageClass can access to protected " + upperClass.protectedModifier);
    }

    public static class EmbeddedClassOfEmbeddedPackage {
        public static void run() {
            UpperClass upperClass = new UpperClass();
            System.out.println("Yes, i EmbeddedPackageSubClass can access to public " + upperClass.publicModifier);
        }
    }
}
