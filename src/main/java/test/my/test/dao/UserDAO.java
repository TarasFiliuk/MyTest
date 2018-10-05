package test.my.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.my.test.entity.Article;
import test.my.test.entity.Color;
import test.my.test.entity.User;

import javax.validation.constraints.Size;
import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findById(int id);
    List<User> findByArticles(User user);


}

