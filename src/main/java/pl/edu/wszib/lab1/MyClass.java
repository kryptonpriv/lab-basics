package pl.edu.wszib.lab1;

import pl.edu.wszib.lab1.mypackage.MyPackageClass;

public class MyClass {
    public String name;
    protected String name1;
    String name2;
    private String name3;

    public static String staticName;
    protected static String staticName1;
    static String staticName2;
    private static String staticName3;

    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Name1: "+ name1);
        System.out.println("Name2: "+ name2);
        System.out.println("Name3: "+ name3);
    }
    public static void printStatic(){
        System.out.println("Name: "+ staticName);
        System.out.println("Name1: "+ staticName1);
        System.out.println("Name2: "+ staticName2);
        System.out.println("Name3: "+ staticName2);
    }
}
