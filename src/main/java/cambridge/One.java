package cambridge;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Question 11
 * The following is an outline Java program which incorporates some built-in data. The data
 * consist of a array of 8 records, where each record is a person’s name together with the
 * associated age (in years) and height (in metres). The program should sort the data so that
 * the records are in ascending order of ages. Complete the program.
 */
public class One {
    public static void main(String[] args) {
        Person[] p = {new Person("George", 34, 1.71f),
                new Person("Betty", 22, 1.76f),
                new Person("Charles", 24, 1.79f),
                new Person("Hanna", 29, 1.66f),
                new Person("Edward", 23, 1.82f),
                new Person("Frida", 28, 1.77f),
                new Person("Davina", 33, 1.69f),
                new Person("Andrew", 25, 1.67f)};
        sort(p);
    }

    private static void sort(Person[] p) {
        ArrayList<Person> persons = new ArrayList<Person>(Arrays.asList(p));
        persons.sort(
                (Person p1, Person p2) -> p1.compareTo(p2));
        for (Person i : persons)
            System.out.printf("%s%n", i);
    }
}

class Person {
    private String name;
    private int age;
    private float height;

    public Person(String n, int a, float h) {
        this.name = n;
        this.age = a;
        this.height = h;
    }

    public String toString() {
        return String.format("%-9s %3d %6.2f",
                this.name, this.age, this.height);
    }

    protected int getAge() {
        return age;
    }

    protected int compareTo(Person p) {
        if (this.getAge() == p.getAge()) {
            return 0;
        } else if (this.getAge() > p.getAge()) {
            return 1;
        } else return -1;
    }
}
