package oops.Inheritence;

class Parent{
    String msg=" ";
    Parent(){
       msg="Welcome home kiddo";
    }
    public void greet(){
        System.out.println(msg);
    }
}

class Child extends Parent{
    String msg=" ";
    Child(){
       msg="I'm Home Mumma";
    }

    public void greet(){
        System.out.println(msg);
    }
}

public class Inheritence {
    public static void main(String args[]){
        Parent p=new Parent();
        p.greet();
        Parent c=new Child();
        c.greet();

    }
}
