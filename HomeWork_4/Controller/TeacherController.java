package HomeWork_4.Controller;

import HomeWork_3.Data.Teacher;
import HomeWork_4.Service.TeacherService;
import HomeWork_4.View.TeacherView;

public class TeacherController implements IUserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public Teacher select(Long teacherId){
        return teacherService.select(teacherId);
    }


    public void editTeacher(){
        teacherService.editTeacher();
    }

    public void showAll(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
