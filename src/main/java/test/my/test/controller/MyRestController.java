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
        userService.save(user);
        return true;
    }

    @GetMapping("/getAll")
    public List<User> getAllUser() {
        return userService.findAll().stream().filter(user -> user.getAge() > 20).collect(Collectors.toList());


    }

    @PostMapping("/saveArticle")
    public boolean saveArticle(@RequestBody Article article,
                               @RequestParam int user_id
    ) {
        System.out.println(article);
        User user = userDAO.findById(user_id);
        article.setUser(user);
        articleService.save(article);
        return true;
    }

    @GetMapping("/getUsersArticle")
    public Set<String> getName() {
        return userService.findAll().stream().filter(user -> user.getArticles().size() > 3).map(user -> user.getName()).collect(Collectors.toSet());
    }

    @GetMapping("/getUserByColor")
    public List<User> getUserByColor(){
    return articleService.findAll().stream().filter(article -> article.getColor().isEqual("green")).map(Article::getUser).collect(Collectors.toList());
    }
}

