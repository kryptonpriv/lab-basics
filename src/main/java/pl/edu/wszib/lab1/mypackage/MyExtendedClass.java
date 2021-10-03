package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.MyClass;

public class MyExtendedClass extends MyPackageClass {

    @Override
    public void print() {
        super.print();
        super.name = "ExtendedName";
        super.name1 = "ExtendedName1";
        super.print();
    }
}
