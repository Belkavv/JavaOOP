package HomeWork_5.service;

import HomeWork_5.data.User;
import HomeWork_5.data.Type;
import HomeWork_5.data.Teacher;
import HomeWork_5.data.Student;


import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService(){
        this.userList = new ArrayList<>();
    }

    public void create(String firstname, String secondName, String lastName,String dateOfBirth, Type type){
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(firstname, secondName, lastName, dateOfBirth, id);
            userList.add(student);
        }
        else if (Type.TEACHER == type){
            Teacher teacher = new Teacher(firstname, secondName, lastName, dateOfBirth, id);
            userList.add(teacher);
        }
    }
    private int getFreeId(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: userList){
            if (user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherID() + 1;
            }
            if (user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentID() + 1;
            }
        }
        return lastId;
    }
    public User getUserId(Type type, int id){
        boolean itsStudent = Type.STUDENT == type;
        for (User user: userList){
            if (user instanceof Teacher && !itsStudent && ((Teacher)user).getTeacherID() == id){
                return user;
            }
            if (user instanceof Student && itsStudent && ((Student)user).getStudentID() == id){
                return user;
            }
        }
        return null;
    }
    public List<User> getAllUser(){
        return userList;
    }

    public List<Student> getAllStudent(){
        List<Student> result = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                result.add((Student)user);
            }
        }
        return result;
    }

    public Teacher getTeacher(){
        for (User user: userList){
            if (user instanceof Teacher){
                return (Teacher)user;
            }
        }
        return null;
    }
}
