package test.my.test.service;

import test.my.test.entity.Color;
import test.my.test.entity.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findById(int id);
//    User findUserByName(String name);

}
