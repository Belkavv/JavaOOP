package HomeWork_3.Data;

import HomeWork_3.Data.Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.getStudentGroups().size() - o2.getStudentGroups().size();
    }
}