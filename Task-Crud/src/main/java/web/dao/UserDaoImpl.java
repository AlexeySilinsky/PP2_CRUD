package web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import web.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    public UserDaoImpl () {

    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }


    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public void removeUserById(Long id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public List<User> getUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void clearUsers() {
        em.createQuery("DELETE FROM User").executeUpdate();
    }
}
