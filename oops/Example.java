package oops;

import java.util.*;

class parent{

    String msg;

    parent(){
        msg="Hello , I am Parent"; //msg is defined when parent class get initiated
    }

    public String welcome(){
        return msg; // returns "Hello , I am Parent"
    }
}

class child extends parent{

    String msg;

    child(){
        msg="Hello , I am Child"; //msg is defined when child class get initiated
    }

    public String welcome(){
        return msg; // returns "Hello , I am Child"
    }
}

public class Example{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        parent p=new parent(); // parent object 
        System.out.println(p.welcome());
        child c=new child(); // chld object
        System.out.println(c.welcome());
        sc.close();
     }
}