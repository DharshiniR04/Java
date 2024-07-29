package oops;
import java.util.*;

class Person {
    static int personCount = 0, parentsCount = 0;

    String name;
    Person father, mother;
    char gender;
    Person[] persons;

    String parent;
    List<String> children;
    char childGender;
    Person[] parents;

    Person(int n) {
        persons = new Person[n];
        parents = new Person[n * 2];
        System.out.println("Finding Mura Ponnu or Paiyan...!!!");
    }

    Person(String parent, String child, char childGender) {
        this.parent = parent;
        this.children = new ArrayList<>();
        this.children.add(child);
        this.childGender = childGender;
    }

    Person(String name, char gender, Person father, Person mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
    }

    public void addPerson(Person obj) {
        persons[personCount++] = obj;
    }

   
    public void addParent(Person obj) {
        boolean found = false;
        for (int i = 0; i < parentsCount; i++) {
            if (parents[i].parent.equals(obj.parent)) {
                parents[i].children.addAll(obj.children);
                found = true;
                break;
            }
        }
        if (!found) {
            parents[parentsCount++] = obj;
        }
    }

    public void famMembers() {
        for (int i = 0; i < personCount; i++) {
            System.out.println("Person " + (i + 1) + " : " + persons[i].name);
        }

        for (int i = 0; i < parentsCount; i++) {
            System.out.println("Parent " + (i + 1) + " : " + parents[i].parent);
            System.out.println("Children: " + parents[i].children);
        }
    }

    public Person findPersonByName(String name) {
        for (int i = 0; i < personCount; i++) {
            if (persons[i].name.equals(name)) {
                return persons[i];
            }
        }
        return null;
    }

    public List<String> findParentByName(String name){
        for (int i = 0; i < parentsCount; i++) {
            if (parents[i].parent.equals(name)) {
                return persons[i].children;
            }
        }
        return null;
    }

    public List<String> findCousins(String name) {
        Person person = findPersonByName(name);
        if (person == null) {
            return null;
        }

        List<String> auntsAndUncles = new ArrayList<>();
        auntsAndUncles=findPersonByName(person.father.parent).father.children;
        System.out.print(auntsAndUncles);
        List<String> cousins = new ArrayList<>();
        for(String s:auntsAndUncles){
            cousins.addAll(findParentByName(s));
        }


        return cousins;
    }
}

public class Family {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of individuals: ");
        int n = sc.nextInt();
        Person obj = new Person(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details of person " + (i + 1) + " : ");
            String name = sc.next();
            char gender = sc.next().charAt(0);
            String father = sc.next();
            String mother = sc.next();
            Person parent1 = new Person(father, name, gender);
            Person parent2 = new Person(mother, name, gender);
            obj.addParent(parent1);
            obj.addParent(parent2);
            Person p = new Person(name, gender, parent1, parent2);
            obj.addPerson(p);
        }
        obj.famMembers();
        System.out.print("Enter a name to find cousins: ");
        String find = sc.next();
        List<String> cousins = obj.findCousins(find);
        if (cousins != null && !cousins.isEmpty()) {
            System.out.println("Cousins of " + find + " are:");
            for (String cousin : cousins) {
                System.out.println(cousin);
            }
        } else {
            System.out.println("No cousins found for " + find);
        }
        sc.close();
    }
}
