package HomeWork_4.Service;

import HomeWork_3.Data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private List<Student> students;
    private Long countMaxID;

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxID);
        countMaxID++;
        students.add(student);
    }

    public StudentService() {
        this.students = new ArrayList<Student>();
        this.countMaxID = 0L;
    }
}
