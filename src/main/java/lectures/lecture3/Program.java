package lectures.lecture3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Student student = new Student("Sergey", "S", 20);
        Iterator<String> components = student;

        while (components.hasNext()){
            System.out.println(student.next());
        }

        for (Student h : student) {

        }
    }
}
