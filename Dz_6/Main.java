package Dz_6;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Anna", "Ivanova", 59, "female");
        Person person2 = new Person("Igor", "Ivanov", 19, "male");
        Person person3 = new Person("Anna", "Ivanova", 59, "female");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person3.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println();

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);

        persons.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(System.out::println);
    }
}
