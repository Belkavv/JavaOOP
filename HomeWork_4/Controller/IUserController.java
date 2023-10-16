package HomeWork_4.Controller;

import HomeWork_3.Data.User;


public interface IUserController <T extends User> {

    public void create(String firstName, String secondName, String patronymic, String dateOfBirth);


}
