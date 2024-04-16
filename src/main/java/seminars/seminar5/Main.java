package seminars.seminar5;

import seminars.seminar5.model.Student;
import seminars.seminar5.model.Teacher;
import seminars.seminar5.view.StudentView;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 20, 1);
        Student s2 = new Student("Sergey", 22, 2);
        Student s3 = new Student("Sergey", 24, 3);
        Student s4 = new Student("Sergey", 23, 4);
        Teacher t1 = new Teacher("Oleg", 34, "Math");
        Teacher t2 = new Teacher("Alexandr", 41, "History");
        Teacher t3 = new Teacher("Maria", 30, "English");

        StudentView studentView = new StudentView();
        studentView.addList(s1);
        studentView.addList(s2);
        studentView.addList(s3);
        studentView.addList(s4);
        studentView.addList(t1);
        studentView.addList(t2);
        studentView.addList(t3);

        studentView.getList("student");
    }
}
