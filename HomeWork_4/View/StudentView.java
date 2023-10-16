package HomeWork_4.View;

import HomeWork_3.Data.Student;

import java.util.List;

public class StudentView implements IUserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student:list){
            System.out.println(student.toString());
        }
    }

}
