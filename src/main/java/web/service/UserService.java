package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> listUsers();


    public User saveUser(User user);
}