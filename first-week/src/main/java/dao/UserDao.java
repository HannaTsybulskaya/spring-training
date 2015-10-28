package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import dao.api.IUserDao;
import domain.User;

@Repository("userDao")
public class UserDao implements IUserDao {

    private Map<String, User> users = new HashMap<String, User>();

    public void create(User user) {
        users.put(user.getId(), user);
    }

    public void delete(String id) {
        users.remove(id);
    }

    public User read(String id) {
        return users.get(id);
    }

    public User getUserByEmail(String email) {
        if (email != null) {
            for (User user : users.values()) {
                if (email.equals(user.getEmail())) {
                    return user;
                }
            }
        }
        return null;
    }

    public List<User> getUsersByName(String name) {
        List<User> result = new ArrayList<User>();
        if (name != null) {
            for (User user : users.values()) {
                if (name.equals(user.getName())) {
                    result.add(user);
                }
            }
        }
        return result;
    }

}
