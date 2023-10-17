package HomeWork_5.service;

import HomeWork_5.data.Student;
import HomeWork_5.data.StudentGroup;
import HomeWork_5.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(){
    }
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        this.studentGroup = new StudentGroup(teacher, students);
        return this.studentGroup;
    }
    public void addStudent(Student student){
        if (!this.getStudentList().contains(student)){
            this.getStudentList().add(student);
        }
    }
    public List<Student> getStudentList(){
        return this.studentGroup.getStudentList();
    }
    public Teacher getTeacher(){
        return this.studentGroup.getTeacher();
    }
    public StudentGroup getStudentGroup(){
        return studentGroup;
    }

}
