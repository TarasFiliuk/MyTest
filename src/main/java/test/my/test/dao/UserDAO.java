package test.my.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.my.test.entity.Color;
import test.my.test.entity.User;

import javax.validation.constraints.Size;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findById(int id);
//    @Query(value = "select u from User where u.name =('vasya')")
//    User findUserByName(String name);


}

