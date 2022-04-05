package hiber.Service;

import hiber.models.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(User user);

    User get(int id);

    List<User> getAllUsers();
}
