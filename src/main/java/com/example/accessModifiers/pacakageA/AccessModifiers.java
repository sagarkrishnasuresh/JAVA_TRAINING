package com.example.accessModifiers.pacakageA;

public class AccessModifiers {

    public String publicField = "I am Public";
    private String privateField = "I am Private";
    protected String protectedField = "I am Protected";
    String defaultField = "I am Default";


    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }


}
