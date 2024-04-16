package seminars.seminar5.controller;

import seminars.seminar5.model.User;
import seminars.seminar5.service.DataService;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();

    public void addList(User user){
        dataService.addList(user);
    }

    public List<User> getList(String type){
        return dataService.getList(type);
    }
}
