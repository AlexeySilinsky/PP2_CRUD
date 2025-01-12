package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUser(Long id);
    void updateUser(User user);
    void removeUserById(Long id);
    List<User> getUsers();
    void clearUsers();
}
