package java_training.accessModifiers.pacakageB;

import java_training.accessModifiers.pacakageA.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicField);    // publicField is Accessible in another package

        // System.out.println(obj.protectedField); // Error: protectedField is not accessible in another package
        // System.out.println(obj.defaultField);   // Error: defaultField is not accessible in another package
        // System.out.println(obj.privateField);   // Error: privateField is not accessible in another package

        inheritedClass objSub = new inheritedClass();
        // System.out.println(objTwo);

        System.out.println(objSub.publicField);
        // System.out.println(objSub.protectedField); // Error: protectedField is not accessible in another package
        System.out.println(objSub.getProtected()); // Trying to access protected field 
        // System.out.println(objSub.privateField);


        
        
        // objTwo.publicMethod();

        // objTwo.protectedMethod(); // not accessible for subclass in another package
        // objTwo.privateMethod(); // not accessible for subclass in another package
        System.out.println(objSub.publicField);

        
        }
    }

class inheritedClass extends AccessModifiers {

    public String getProtected(){ 
        return protectedField; // Protected is accessible for subclass in another package
    }

    @Override
    public String toString(){
        return "Public Field=" + publicField; // public is accessible for subclass in another package
        // return "Protected Field=" + protectedField; // Protected is accessible for subclass in another package


        // return "Private Field=" + privateField; // Private not accessible for subclass in another package
        // return "Default Field=" + defaultField; // default not accessible for subclass in another package
    }

}
