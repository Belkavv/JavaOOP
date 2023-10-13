package HomeWork_3.Data;

import HomeWork_3.Data.Student;
import HomeWork_3.Data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
