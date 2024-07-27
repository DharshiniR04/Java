package oops;
import java.util.*;

class Person{
    String name;
    char gender;
    Person father,mother;
    Person child[];
    Person(String name,char gender,Person father, Person mother){
       this.name=name;
       this.gender=gender;
       this.father=father;
       this.mother=mother;
       
    }
}

public class Family{
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter number of individulas:");
           int n=sc.nextInt();
           for(int i=0;i<n;i++){
                String name=sc.next();
                char gender=sc.next().charAt(0);
                String father=sc.next();
                String mother=sc.next();
                Person p=new Person(name,gender, null, null);
           }
           System.out.print("Enter a name");
           String find=sc.next();
           Person p=new Person("Surya",'M', null, null);
           sc.close();
    }
}