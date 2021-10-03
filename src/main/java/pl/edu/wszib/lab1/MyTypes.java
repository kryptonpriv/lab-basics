package pl.edu.wszib.lab1;

public class MyTypes {
    public static int myInt;
    public static Integer myInteger;

    public static void main(String[] args) {
        System.out.println("MyInt " + myInt);
        Integer myLocalIntiger = myInt;
        int myLocalInt = myInteger;

 //       int myLocalInt = 1000000000000000000000;
        long myLocalLong = 100000000L;
    }
}
