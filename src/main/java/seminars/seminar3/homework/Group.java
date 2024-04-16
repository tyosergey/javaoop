package seminars.seminar3.homework;

import java.util.List;

public class Group {
    private String name;
    private List<Group> groupList;

    public Group(List<Group> groupList, String name) {
        this.groupList = groupList;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }
}
