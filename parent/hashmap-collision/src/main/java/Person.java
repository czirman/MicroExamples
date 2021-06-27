import java.util.Objects;

public class Person {
    private Integer pesel;
    private String name;
    private String surnameName;

    public Person(Integer pesel, String name, String surnameName) {
        this.pesel = pesel;
        this.name = name;
        this.surnameName = surnameName;
    }

 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surnameName, person.surnameName);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel.equals(person.pesel);
    }

    @Override
    public int hashCode() {
        if (pesel >0 && pesel<=10)
            return 1;
        else if (pesel >10 && pesel<=20)
            return 2;
        else
            return 0;
    }
}
