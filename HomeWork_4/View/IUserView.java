package HomeWork_4.View;

import HomeWork_3.Data.User;

import java.util.List;

public interface IUserView<T extends User>  {
    public void sendOnConsole(List<T> list);
}
