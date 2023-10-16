package HomeWork_4.Controller;

import HomeWork_3.Data.Student;
import HomeWork_4.Service.StudentService;
import HomeWork_4.View.StudentView;

public class StudentController implements IUserController<Student>{

    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        studentService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(studentService.getAll());
    }
}
