package HomeWork_3.Controller;

import HomeWork_3.Data.*;
import HomeWork_3.Service.DataService;
import HomeWork_3.Service.StreamService;
import HomeWork_3.Service.StudentGroupService;
import HomeWork_3.View.UserView;

import java.util.List;

public class UserController {
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String patronymic, String dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getUsers();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        userView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void createStream(List<StudentGroup> groups){
        streamService.createStream(groups);
        userView.sendOnConsoleStream(StreamService.getStream());
    }
    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public List<Stream> getSortedStreamsByGroupCount(List<Stream> stream){
        return streamService.getSortedStreamsByGroupCount(stream);
    }
}
