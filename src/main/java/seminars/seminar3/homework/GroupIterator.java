package seminars.seminar3.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<Group> {
    private List<Group> groups = new ArrayList<>();
    private int count;
    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public Group next() {
        return groups.get(count++);
    }
}
