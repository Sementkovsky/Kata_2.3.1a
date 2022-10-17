package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public List<User> listUsers();
  //  public void createUsersTable();
  //  public void dropUsersTable();
  //  public void saveUser(User user);

    void saveUser(User user);
    // public void removeUserById(long id);
   // public List<User> getAllUsers();
  //  public void cleanUsersTable();
}
