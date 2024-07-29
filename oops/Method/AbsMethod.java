package oops.Method;

abstract class ParentClass {
    abstract void greet();
    abstract void bye();
    void destroy() {  // destroy() method need not to be extended by the childClasses because it's not an abstract method.
        System.out.println("Destroyed..");
    }
}

abstract class ChildClass1 extends ParentClass {  // ChildClass1 will also be an abstract class since bye() method is not implemented, which is an abstract method from the parent class.
    @Override
    void greet() {
        System.out.println("Hello, Developers from ChildClass1");
    }
}

class ChildClass2 extends ParentClass {  // ChildClass2 will not be an abstract class since bye() method got implemented, which is an abstract method from the parent class.
    @Override
    void greet() {
        System.out.println("Hello, Developers from ChildClass2");
    }

    @Override
    void bye() {
        System.out.println("Bye, Developers from ChildClass2");
    }
}

public class AbsMethod {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass2();  //childClass2 object
        obj.greet();
        obj.bye();
        obj.destroy();
       
        //childClass1 object can't be created , because it's an abtract class and abstract class can't be  instantiated 
    }
}
