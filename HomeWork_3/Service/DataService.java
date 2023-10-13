package HomeWork_3.Service;

import HomeWork_3.Data.Student;
import HomeWork_3.Data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void create(String firstName,String secondName,String patronymic,String dateOfBirth){
        long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;
        Student student = new Student(firstName,secondName,patronymic,dateOfBirth,countMaxId);
        this.users.add(student);
    }
}
