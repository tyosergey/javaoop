package seminars.seminar3.homework;

import java.util.Comparator;

public class SteamComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
