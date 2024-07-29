package oops.Method;

class Method1{

     String welcome="";
     public static void greet(){
       System.out.println("Hello from static method");
     }

     public void Greet(){
      System.out.println("Hello from non-static method");
     }

     public void setGreet(String s){
         welcome=s;
     }

     public void getGreet(){
          System.out.println(welcome);
     }

}

public class Method{
   public static void main(String[] args) {
        Method1.greet(); // static method can be accessed without an object
        Method1 meth=new Method1();
        meth.Greet();  
        meth.setGreet("Hello from Developer"); //setting the value using Accessor method
        meth.getGreet(); //getting the value using Mutator method
   } 
}