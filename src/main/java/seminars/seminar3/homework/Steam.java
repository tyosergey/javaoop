package seminars.seminar3.homework;

import java.util.Iterator;

public class Steam implements Iterable<Group>{
    @Override
    public Iterator<Group> iterator() {
        return new GroupIterator();
    }
}
