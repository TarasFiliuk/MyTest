package test.my.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.my.test.dao.UserDAO;
import test.my.test.entity.Article;
import test.my.test.entity.Color;
import test.my.test.entity.User;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findByArticles(User user)
    {
//        User user = new User();
        List<User> users = userDAO.findAll();
        List<Article> articles = user.getArticles();
        List<Article> collect = articles.stream().filter(article1 ->articles.stream().equals(Color.GREEN)).collect(Collectors.toList());
        user.setArticles(collect);
        return users;


    }

//    @Override
//    public User findUserByName(String name) {
//        return userDAO.findUserByName(name);
//    }


}
