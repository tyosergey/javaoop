package seminars.seminar3.lesson;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Stream>{
    private List<String> GroupList;

    public Stream(List<String> groupList) {
        GroupList = groupList;
    }

    @Override
    public Iterator<Stream> iterator() {
        return new StreamIterator();
    }
}
