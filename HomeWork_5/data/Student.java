package HomeWork_5.data;

public class Student extends User{
    private int studentID;

    public Student(String firstName, String secondName, String lastName, String dateOfBirth, int studentID) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID: " + studentID + '\n' +
                " FirstName: " + super.getFirstName() + '\'' +
                ", SecondName: " + super.getSecondName() + '\'' +
                ", lastName: " + super.getLastName() + '\'' +
                ", DateOfBirth: " + super.getDateOfBirth() +
                "}" + '\n';
    }
}

