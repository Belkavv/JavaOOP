package HomeWork_3.Data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> studentGroups;

    public StreamIterator(Stream stream) {
        this.count = 0;
        this.studentGroups = stream.getStudentGroups();
    }

    @Override
    public boolean hasNext() {
        return count < studentGroups.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return studentGroups.get(count);
    }
}
