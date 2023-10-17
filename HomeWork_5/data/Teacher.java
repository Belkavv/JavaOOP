package HomeWork_5.data;

public class Teacher extends User{
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastName, String dateOfBirth, int teacherID) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "{" +
                "teacherID: " + teacherID + '\n' +
                "FirstName: " + super.getFirstName() + '\'' +
                ", SecondName: " + super.getSecondName() + '\'' +
                ", Patronymic: " + super.getLastName() + '\'' +
                ", DateOfBirth: " + super.getDateOfBirth() +
                "}" + '\n';
    }
}
