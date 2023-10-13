package HomeWork_3.Service;

import HomeWork_3.Data.Stream;
import HomeWork_3.Data.StreamComparator;
import HomeWork_3.Data.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private static Stream stream;

    public void createStream(List<StudentGroup> groups){
        this.stream = new Stream(groups);
    }

    public List<Stream> getSortedStreamsByGroupCount(List<Stream> streams){
        List<Stream> list = new ArrayList<>(streams);
        list.sort(new StreamComparator());
        return list;
    }

    public static Stream getStream() {
        return stream;
    }
}
