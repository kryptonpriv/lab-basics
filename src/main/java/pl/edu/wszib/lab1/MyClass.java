package pl.edu.wszib.lab1;

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
}
