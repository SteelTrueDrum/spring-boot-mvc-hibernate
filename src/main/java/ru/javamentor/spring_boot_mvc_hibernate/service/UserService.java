package ru.javamentor.spring_boot_mvc_hibernate.service;

import ru.javamentor.spring_boot_mvc_hibernate.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
