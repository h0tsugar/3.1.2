package ru.zaitsev.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.zaitsev.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public User searchUserById(Long id) {
        return entityManager.find(User.class, id);
    }
}
