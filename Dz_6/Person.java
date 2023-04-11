package Dz_6;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Person))
            return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname)
                && gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender);
    }

}
