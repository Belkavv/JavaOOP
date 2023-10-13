package HomeWork_3.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>,Comparable<StudentGroup>{
    private List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = new ArrayList<>(studentGroups);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public String toString() {
        return "Stream" + studentGroups;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return 0;
    }
}
