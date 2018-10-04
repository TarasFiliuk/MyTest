package test.my.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import test.my.test.dao.UserDAO;
import test.my.test.entity.Article;
import test.my.test.entity.Color;
import test.my.test.entity.User;
import test.my.test.service.ArticleServiceImpl;
import test.my.test.service.UserServiceImpl;

import javax.persistence.UniqueConstraint;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class MyRestController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    ArticleServiceImpl articleService;
    @Autowired
    UserDAO userDAO;

    @PostMapping("/saveUser")
    public boolean saveUser(@RequestBody User user) {
//        User user = new User();
//        user.setName(name);
//        user.setAge(age);

        userService.save(user);
        return true;
    }

    @GetMapping("/getAll")
    public List<User> getAllUser() {
        List<User> all = userService.findAll();
        List<User> collect = all.stream().filter(user -> user.getAge() > 20).collect(Collectors.toList());
        return collect;


    }

    @PostMapping("/saveArticle")
    public boolean saveArticle(@RequestBody Article article,
                               @RequestParam int user_id
                               ) {
        User user = userDAO.findById(user_id);
        article.setUser(user);
        articleService.save(article);
        return true;
    }
//    @GetMapping("/getUsersArticle")
//    public List<User> getUserArticle(){
//        List<User> all = userService.findAll();
//
////        all.stream().filter()
////        List<Article> articles = user.getArticles();
////        List<Article> collect = articles.stream().filter(article -> article.getColor() == Color.RED).collect(Collectors.toList());
//            return;
//        }
    }

