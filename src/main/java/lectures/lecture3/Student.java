package lectures.lecture3;

import java.util.Iterator;

public class Student implements Iterator<String>, Iterable<Student>{
    private String name;
    private String surname;
    private Integer age;

    public Student(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("firstName: %s", name);
            case 2:
                return String.format("secondName: %s", surname);
            default:
                return String.format("age: %s", age);
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
