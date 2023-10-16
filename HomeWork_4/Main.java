package HomeWork_4;

import HomeWork_4.Controller.TeacherController;

public class Main {
    public static void main(String[] args) {
        TeacherController tController = new TeacherController();
        tController.create("1","2","3","17.02.2004");
        tController.create("4","5","6","03.11.1986");
        tController.editTeacher();
        tController.showAll();
    }
}
