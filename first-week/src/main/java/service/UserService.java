package service;

import java.util.List;

import service.api.IUserService;
import dao.api.IUserDao;
import domain.User;

public class UserService implements IUserService {

    private IUserDao userDao;

    public void register(User user) {
        userDao.create(user);
    }

    public void remove(String id) {
        userDao.delete(id);
    }

    public User getById(String id) {
        return userDao.read(id);
    }

    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    public List<User> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    public void getBookedTickets(User user) {
        // TODO Auto-generated method stub
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
