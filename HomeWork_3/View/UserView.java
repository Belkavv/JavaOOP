package HomeWork_3.View;

import HomeWork_3.Data.Stream;
import HomeWork_3.Data.Student;
import HomeWork_3.Data.StudentGroup;
import HomeWork_3.Data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {
    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

    public void sendOnConsoleStream(Stream stream) {logger.info(stream.toString());}

    public void sendOnConsoleListStream(List<Stream> stream) {logger.info(stream.toString());}
}
