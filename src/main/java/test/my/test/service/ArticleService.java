package test.my.test.service;

import org.springframework.data.jpa.repository.JpaRepository;
import test.my.test.entity.Article;
import test.my.test.entity.Color;

import java.util.List;

public interface ArticleService {
    void save (Article article);
    List<Article> findAll();
}
