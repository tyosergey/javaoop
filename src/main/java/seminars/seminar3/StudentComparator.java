package seminars.seminar3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getName() + o1.getId();
        String name2 = o2.getName() + o2.getId();
        return name1.compareTo(name2);
    }
}
