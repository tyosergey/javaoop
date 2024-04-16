package seminars.seminar5.service;

import seminars.seminar5.model.Student;
import seminars.seminar5.model.Teacher;
import seminars.seminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> students = new ArrayList<>();
    private List<User> teachers = new ArrayList<>();

    public void addList(User user){
        if (user instanceof Student){
            students.add(user);
        }else if(user instanceof Teacher){
            teachers.add(user);
        }
    }

    public List<User> getList(String type){
        if(type.equals("student")){
            return students;
        }else if (type.equals("teacher")){
            return teachers;
        }
        return null;
    }


}
