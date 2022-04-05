package hiber.Service;

import hiber.dao.UserDaoImpl;
import hiber.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;

    @Transactional
    @Override
    public void add(User user) {
        userDaoImpl.add(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDaoImpl.delete(user);
    }

    @Transactional
    @Override
    public User get(int id) {
        return userDaoImpl.get(id);
    }

    @Transactional
    @Override
    public List<User> getAllUsers(){
        return userDaoImpl.listUsers();
    }


}
