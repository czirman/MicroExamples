package list;

public class Person implements Comparable{

    String surname;
    String name;

    @Override
    public int compareTo(Object o) {
        return (surname.compareTo(o.toString()) );
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "list.Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
