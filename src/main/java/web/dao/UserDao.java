package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public User getById (int id);

    public List<User> listUsers();
  //  public void createUsersTable();
  //  public void dropUsersTable();
  //  public void saveUser(User user);

    public void saveUser(User user);
    // public void removeUserById(long id);
   // public List<User> getAllUsers();
  //  public void cleanUsersTable();

    public void removeUser (int id);
    public void updateUser(User user);

}
