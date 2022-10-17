package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public User getById (int id);
    public List<User> listUsers();


    public User saveUser(User user);

    public void removeUser(int id);

    public void updateUser(User user);
}