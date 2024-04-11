package seminars.seminar3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Bryan", 1);
        Student s2 = new Student("Alice", 2);
        Student s3 = new Student("Angela", 3);
        Student s4 = new Student("John", 4);
        Student s5 = new Student("Mike", 5);
        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        StudentGroup studentGroup = new StudentGroup(students);

        for (Student student : studentGroup) {
            System.out.println(student.getName());
        }

        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals("Angela")) {
                students.remove(student);
            }
        }
        System.out.println("Проверка после удаления");
        for (Student student : studentGroup) {
            System.out.println(student.getName());
        }

        System.out.println(s1.compareTo(s3));
        System.out.println();

        TreeSet<Student> treeSet = new TreeSet<>(new StudentComparator());
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

//        for (Student student : students) {
//            treeSet.add(student);
//        }

//        for (Student student : treeSet) {
//            System.out.println(student.getName());
//        }
        System.out.println(treeSet);
    }
}
