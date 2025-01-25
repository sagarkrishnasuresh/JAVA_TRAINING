package java_training.accessModifiers.pacakageA;

public class Main {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicField);
        System.out.println(obj.protectedField); 
        System.out.println(obj.defaultField);  
       // System.out.println(obj.privateField);   // Error: privateField is not accessible
        obj.publicMethod();
        obj.protectedMethod();
       // obj.privateMethod(); // Error: privateMethod is not accessible
        
    }

    
}
