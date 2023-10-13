package HomeWork_3;

import HomeWork_3.Data.*;
import HomeWork_3.Controller.UserController;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        Student student1 = new Student("1", "1", "1", "01.01.1994", 13L);
        Student student2 = new Student("2", "2", "2", "23.08.1995", 17L);
        Student student3 = new Student("3", "3", "3", "17.06.2003", 27L);
        Student student4 = new Student("4", "4", "4", "08.03.1998", 5L);
        StudentGroup group1 = new StudentGroup(new Teacher("7", "8", "9", "09.07.1982", 91L), List.of((new Student("5", "5", "5", "11.06.1997", 11L)), student2, student3));

        StudentGroup group2 = new StudentGroup(new Teacher("11", "12", "13", "16.09.1980", 26L), List.of(student3, student4));

        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(group1);
        studentGroups.add(group1);
        studentGroups.add(group1);

        List<StudentGroup> studentGroups1 = new ArrayList<>();
        studentGroups1.add(group2);
        studentGroups1.add(group1);
        Stream stream = new Stream(studentGroups);
        Stream stream1 = new Stream(studentGroups1);

        List<Stream> streams = List.of(stream,stream1);
        streams = userController.getSortedStreamsByGroupCount(streams);
        for (Stream groups : streams) {
            System.out.println(groups);
        }
    }
}
