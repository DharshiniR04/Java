package oops.Constructor;

class Parent{
    int id;
    Parent(){
       System.out.println("Hi.");
    }

    Parent(String s,int id){
        this.id=id;
        System.out.println("Hi , "+s);
    }
}


public class Constructor {
    public static void main(String args[]){
        
       Parent p=new Parent();
       Parent p1=new Parent("Good Morning.",1);
       Parent p2=new Parent("Good Night.",2);

       //Copy Constructor

       System.out.println(p2.id); //before assigning
       p2.id=p1.id;  // Assigning value of id from one object to another.
       System.out.println(p2.id); //after assigning
    }
}


