package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.MyClass;

public class MyPackageClass extends MyClass {
    //public
    //protected
    //default/package-private
    //private

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyClass myClass = new MyClass();
        myClass.name = "Name";
        myClass.name1 = "Name1";
        myClass.name2 = "Name2";
        myClass.print();
    }

}
