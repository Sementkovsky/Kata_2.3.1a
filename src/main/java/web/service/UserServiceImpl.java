package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    public List<User> listUsers() {
        return dao.listUsers();
    }

        public User saveUser(User user){
            dao.saveUser(user);
            return user;
        }
    }

