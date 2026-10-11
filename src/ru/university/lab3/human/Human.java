package ru.university.lab3.human;

public class Human implements Comparable<Human> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    // Естественный порядок: по имени, затем по фамилии, затем по возрасту
    @Override
    public int compareTo(Human other) {
        int c = firstName.compareTo(other.firstName);
        if (c != 0) return c;
        c = lastName.compareTo(other.lastName);
        if (c != 0) return c;
        return Integer.compare(age, other.age);
    }

    // equals и hashCode — чтобы HashSet/LinkedHashSet правильно убирали дубликаты
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age
                && firstName.equals(human.firstName)
                && lastName.equals(human.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}
