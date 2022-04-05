package hiber.dao;

import hiber.models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public User get(int id){

        User user = entityManager.find(User.class,  id);
        entityManager.detach(user);
        return user;
    }

    @Override
    public void set(User newUser) {

//        User user = get(newUser.getId());
//
//        wn.detach(movie);
//        movie.setLanguage("Italian");
//        em.merge(movie);

    }

    @Override
    public List<User> listUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User",User.class);
        return query.getResultList();
    }






}
