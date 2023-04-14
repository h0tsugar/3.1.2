package ru.zaitsev.service;

import ru.zaitsev.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getAllUser();

    void update(User user);

    void delete(User user);

    User searchUserById(Long id);
}
