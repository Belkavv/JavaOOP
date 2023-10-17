package HomeWork_5.controller;

import HomeWork_5.data.Student;
import HomeWork_5.data.Type;
import HomeWork_5.data.User;
import HomeWork_5.data.StudentGroup;
import HomeWork_5.service.DataService;
import HomeWork_5.service.StudentGroupService;
import HomeWork_5.view.StudentGroupView;
import HomeWork_5.view.StudentView;


import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    StudentGroupView studentGroupView = new StudentGroupView();
    StudentGroupService studentGroupService = new StudentGroupService();


    public void createStudent(String firstname, String secondName, String lastName,String dateOfBirth){
        service.create(firstname, secondName, lastName, dateOfBirth, Type.STUDENT);
    }
    public void createTeacher(String firstname, String secondName, String lastName,String dateOfBirth){
        service.create(firstname, secondName, lastName, dateOfBirth, Type.TEACHER);
    }
    public void getAllStudent(){
        List<Student> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
    public void createStudentGroup(){
        studentGroupService.createStudentGroup(service.getTeacher(),service.getAllStudent());
    }
    public void printStudentGroup(){
        studentGroupView.printStudentGroup(studentGroupService.getStudentGroup());
    }

}
