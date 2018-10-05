package test.my.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.my.test.dao.ArticleDAO;
import test.my.test.entity.Article;
import test.my.test.entity.Color;
import test.my.test.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDAO articleDAO;
    @Override
    public void save(Article article) {
        articleDAO.save(article);
    }

    @Override
    public List<Article> findAll() {
        return articleDAO.findAll();
    }


}
