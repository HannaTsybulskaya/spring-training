package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.api.IUserService;
import dao.api.IBookingDao;
import dao.api.IUserDao;
import domain.BookedTicket;
import domain.User;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IBookingDao bookingDao;

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

    public List<BookedTicket> getBookedTickets(User user) {
        return bookingDao.getBookedTickets(user);
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
