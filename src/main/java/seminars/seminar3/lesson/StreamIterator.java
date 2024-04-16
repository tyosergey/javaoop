package seminars.seminar3.lesson;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Stream> {
    private List<Stream> streams;
    private int count;

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean hasNext() {
        return count < streams.size();
    }

    @Override
    public Stream next() {
        return streams.get(count++);
    }
}
