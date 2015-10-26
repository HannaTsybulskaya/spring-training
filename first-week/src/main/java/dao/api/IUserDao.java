package dao.api;

import java.util.List;

import domain.User;

public interface IUserDao {

    void create(User user);

    void delete(String id);

    User read(String id);

    User getUserByEmail(String email);

    List<User> getUsersByName(String name);

}
