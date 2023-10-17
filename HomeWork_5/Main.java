package HomeWork_5;

import HomeWork_5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("1","2","3","10");
        controller.createStudent("4","5","6","11");
        controller.createStudent("7","8","9","12");

        controller.createStudentGroup();
        controller.printStudentGroup();
    }
}
