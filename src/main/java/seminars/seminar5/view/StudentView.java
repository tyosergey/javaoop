package seminars.seminar5.view;

import seminars.seminar5.controller.Controller;
import seminars.seminar5.model.User;

import java.util.List;

public class StudentView {
    Controller controller = new Controller();

    public void addList(User user){
        controller.addList(user);
        System.out.println();
    }

    public List<User> getList(String type){
        return controller.getList("student");
    }
}
