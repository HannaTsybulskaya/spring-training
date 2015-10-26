package service.api;

import java.util.List;

import domain.User;

public interface IUserService {

    void register(User user);

    void remove(String id);

    User getById(String id);

    User getUserByEmail(String email);

    List<User> getUsersByName(String name);

    void getBookedTickets(User user);

}
