package hiber.dao;

import hiber.models.User;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserDao {

    void add(User user);

    void delete(User user);

    User get(int id);

    void set(User newUser);

    List<User> listUsers();
}
